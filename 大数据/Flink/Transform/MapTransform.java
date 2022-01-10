package com.raylee.demo.Lesson04;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;


public class MapTransform {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.createLocalEnvironmentWithWebUI(new Configuration());
        env.setParallelism(2);
        ParameterTool parameterTool = ParameterTool.fromArgs(args);
        String hostname = parameterTool.get("hostname", "localhost");
        int port = parameterTool.getInt("port", 9999);
        DataStreamSource<String> data = env.socketTextStream(hostname, port);

        // 第一个是输入
        // 第二个是输出类型
        // 可以是多并行的，map必须实现 MapFunction
        SingleOutputStreamOperator<String> dataUpper = data.map(new MapFunction<String, String>() {
            @Override
            public String map(String word) throws Exception {
                return word.toUpperCase();
            }
        });

        // lambda 表达式
        SingleOutputStreamOperator<String> stringSingleOutputStreamOperator = data.map(String::toUpperCase);

        dataUpper.print();
        env.execute(MapTransform.class.getSimpleName());
    }
}

