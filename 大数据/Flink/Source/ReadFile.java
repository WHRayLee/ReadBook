package com.raylee.demo.Lesson02;

import org.apache.flink.api.java.io.TextInputFormat;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.source.FileProcessingMode;

public class ReadFile {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.createLocalEnvironmentWithWebUI(new Configuration());
        // 1. hdfs
        // 2. 本地文件(可以指定目录：如果目录下任意一个文件发生变化，那么每个task都会读一遍【全量】)
        //    会重复读取数据:无限数据流
        String path = "file:///";
        //  PROCESS_ONCE,
        //  PROCESS_CONTINUOUSLY;
        DataStreamSource<String> stringDataStreamSource = env.readFile(new TextInputFormat(null),
                path,
                FileProcessingMode.PROCESS_CONTINUOUSLY,
                2000);
        int parallelism = stringDataStreamSource.getParallelism();
        System.out.println("多并行度：" + parallelism);
        stringDataStreamSource.print();
        env.execute(ReadFile.class.getSimpleName());
    }
}
