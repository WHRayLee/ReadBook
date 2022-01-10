package com.raylee.demo.Lesson03;

import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class SinkWriteToSocket {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.createLocalEnvironmentWithWebUI(new Configuration());
        String path = "";
        env.setParallelism(2);
        ParameterTool parameterTool = ParameterTool.fromArgs(args);
        String hostname = parameterTool.get("hostname", "localhost");
        int port = parameterTool.getInt("port", 9999);
        DataStreamSource<String> data = env.socketTextStream(hostname, port);
        // 指定序列化的方式
        data.writeToSocket(hostname, 10000, new SimpleStringSchema());
        env.execute(SinkWriteToSocket.class.getSimpleName());
    }
}
