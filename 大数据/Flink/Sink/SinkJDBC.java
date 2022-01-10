package com.raylee.demo.Lesson03;

import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.connector.jdbc.JdbcConnectionOptions;
import org.apache.flink.connector.jdbc.JdbcSink;
import org.apache.flink.connector.jdbc.JdbcStatementBuilder;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

import java.util.Arrays;

public class SinkJDBC {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.createLocalEnvironmentWithWebUI(new Configuration());
        env.setParallelism(2);
        ParameterTool parameterTool = ParameterTool.fromArgs(args);
        String hostname = parameterTool.get("hostname", "localhost");
        int port = parameterTool.getInt("port", 9999);
        DataStreamSource<String> data = env.socketTextStream(hostname, port);
        // 必须开启checkpoint
        env.enableCheckpointing(5000);
        // 必须指定数据类型，否则后续使用将无法获得对应的数据类型
        SingleOutputStreamOperator<Tuple2<String, Integer>> flatMapResult = data.flatMap((String line, Collector<Tuple2<String, Integer>> out) -> Arrays.stream(line.split(",")).forEach(word -> out.collect(Tuple2.of(word, 1))));
        SingleOutputStreamOperator<Tuple2<String, Integer>> result = flatMapResult.keyBy(tuple -> tuple.f0).sum(1);

        result.addSink(JdbcSink.sink("insert into values (?, ?)", (JdbcStatementBuilder<Tuple2<String, Integer>>) (preparedStatement, in) -> {
            preparedStatement.setString(1,in.f0);
            preparedStatement.setInt(2, in.f1);
        }, new JdbcConnectionOptions.JdbcConnectionOptionsBuilder()
        .withDriverName("com.mysql.jdbc.Driver")
        .withPassword("1234546")
        .withUsername("root")
        .withUrl("jdbc:mysql://")
        .build())
        );
        env.execute(SinkJDBC.class.getSimpleName());
    }
}
