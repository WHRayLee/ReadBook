package com.raylee.demo.Lesson02;

import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.source.RichSourceFunction;

import java.util.Arrays;
import java.util.List;

public class SelfDefineRichSourceFunction {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(2);
        // 轮询读取source数据
        DataStreamSource<String> data = env.addSource(new MySource2());
        int parallelism = data.getParallelism();
        System.out.println("并行度：" + parallelism);
        data.print();
        env.execute();
    }

    private static class MySource2 extends RichSourceFunction<String> {
        @Override
        public void run(SourceContext<String> ctx) throws Exception {
            List<String> strings = Arrays.asList("aaa", "bb", "ccc", "ddd", "eee");
            // 发送数据用 ctx
            for (String string : strings) {
                ctx.collect("test1-" + string);
            }
        }

        @Override
        public void cancel() {

        }
    }
}
