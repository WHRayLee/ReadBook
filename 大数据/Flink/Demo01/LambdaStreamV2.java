package com.raylee.demo.Lesson01;

import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.LocalStreamEnvironment;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

import java.util.Arrays;

public class LambdaStreamV2 {
    public static void main(String[] args) throws Exception {
        // 只能在local模式下执行
        // 通常用于本地测试
        LocalStreamEnvironment env = StreamExecutionEnvironment.createLocalEnvironment(8);

        ParameterTool parameterTool = ParameterTool.fromArgs(args);
        String hostname = parameterTool.get("hostname", "localhost");
        int port = parameterTool.getInt("port", 9999);

        // source
        DataStreamSource<String> dataSource = env.socketTextStream(hostname, port);


        SingleOutputStreamOperator<Tuple2<String, Integer>> result = dataSource
                // Arrays.stream 只有使用collector的时候才使用
                .flatMap((String line, Collector<Tuple2<String, Integer>> out) -> Arrays.stream(line.split(","))
                .forEach(w -> out.collect(Tuple2.of(w, 1))))
                .keyBy(tuple -> tuple.f0)
                .sum(1)
                // 指定返回类型，避免不需要的错误
                .returns(Types.TUPLE(Types.STRING, Types.INT));
        result.print().setParallelism(1);
        String simpleName = LambdaStreamV2.class.getSimpleName();
        env.execute(simpleName);
    }
}
