package com.raylee.demo.Lesson03;

import org.apache.flink.api.common.serialization.Encoder;
import org.apache.flink.api.common.serialization.SimpleStringEncoder;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.core.fs.Path;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.sink.filesystem.StreamingFileSink;
import org.apache.flink.streaming.api.functions.sink.filesystem.rollingpolicies.DefaultRollingPolicy;

public class SinkWithCheckpoint {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.createLocalEnvironmentWithWebUI(new Configuration());
        env.setParallelism(2);
        ParameterTool parameterTool = ParameterTool.fromArgs(args);
        String hostname = parameterTool.get("hostname", "localhost");
        int port = parameterTool.getInt("port", 9999);
        DataStreamSource<String> data = env.socketTextStream(hostname, port);
        env.enableCheckpointing(5000);
        DefaultRollingPolicy<String, String> defaultRollingPolicy = DefaultRollingPolicy.builder()
                .withRolloverInterval(30 * 1000L) // 30秒滚动一个文件
                .withMaxPartSize(1024L * 1024L * 100) // 100M 生成一个文件
                .build();
        StreamingFileSink<String> fileSink = StreamingFileSink.forRowFormat(new Path("file:///"),
                new SimpleStringEncoder<String>("UTF-8"))
                .withRollingPolicy(defaultRollingPolicy)
                .build();
        data.addSink(fileSink);
        env.execute(SinkWithCheckpoint.class.getSimpleName());
    }
}
