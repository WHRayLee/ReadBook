package com.raylee.demo.Lesson01;

import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.LocalStreamEnvironment;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.util.Arrays;

public class LambdaStream {
    public static void main(String[] args) throws Exception {
        // 只能在local模式下执行
        // 通常用于本地测试
        LocalStreamEnvironment env = StreamExecutionEnvironment.createLocalEnvironment(8);

        ParameterTool parameterTool = ParameterTool.fromArgs(args);
        String hostname = parameterTool.get("hostname", "localhost");
        int port = parameterTool.getInt("port", 9999);

        // source
        DataStreamSource<String> dataSource = env.socketTextStream(hostname, port);

        SingleOutputStreamOperator<Tuple2<Object, Integer>> result = dataSource.flatMap((line, out) -> Arrays.stream(line.split(","))
                .forEach(w -> out.collect(w)))
                .map(word -> Tuple2.of(word, 1))
                .keyBy(0)
                .sum(1);
        result.print().setParallelism(1);
        String simpleName = LambdaStream.class.getSimpleName();
        env.execute(simpleName);
    }
}
