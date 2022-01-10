package com.raylee.demo.Lesson02;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

public class demoV2 {
    public static void main(String[] args) throws Exception {
        // 默认是逻辑核数的个数为并行度
        // 创建本地可以查看web UI的信息
        // 设置参数，并传入
        Configuration configuration = new Configuration();
        configuration.setInteger("rest",9999);
        StreamExecutionEnvironment env = StreamExecutionEnvironment.createLocalEnvironmentWithWebUI(configuration);
        // 程序默认并行度
        int parallelism2 = env.getParallelism();
        System.out.println("程序默认的并行度：" + parallelism2);
        DataStreamSource<String> data = env.socketTextStream("localhost", 8888);
        // parallel -> 对应 task个数
        // Source -> Transform rebalance task划分
        int parallelism = data.getParallelism();
        System.out.println("并行度：" + parallelism);
        // 第一个参数是输入的类型
        // 第二个参数输出的类型
        SingleOutputStreamOperator<String> words = data.flatMap(new FlatMapFunction<String, String>() {
            @Override
            public void flatMap(String line, Collector<String> out) throws Exception {
                String[] words = line.split(",");
                for (String word : words) {
                    out.collect(word);
                }
            }
        });
        int parallelism1 = words.getParallelism();
        System.out.println("经过task划分之后的并行度：" + parallelism1);

        env.execute();
    }
}
