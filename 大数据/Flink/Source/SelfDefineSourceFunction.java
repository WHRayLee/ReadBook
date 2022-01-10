package com.raylee.demo.Lesson02;

import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.source.SourceFunction;

import java.util.Arrays;
import java.util.List;

public class SelfDefineSourceFunction {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.createLocalEnvironmentWithWebUI(new Configuration());
        env.setParallelism(2);
        DataStreamSource<String> data = env.addSource(new MySourceData());
        System.out.println("并行度：" + data.getParallelism());
        data.print();
        env.execute(SelfDefineSourceFunction.class.getSimpleName());
    }

    // SourceFunction<String>: 返回的是String类型
    // 实现 SourceFunction接口的并行度只能是1
    private static class MySourceData implements SourceFunction<String> {
        // 发送数据
        @Override
        public void run(SourceContext ctx) throws Exception {
            List<String> strings = Arrays.asList("aaa", "bb", "ccc", "ddd", "eee");
            // 发送数据用 ctx
            for (String string : strings) {
                ctx.collect("test1-" + string);
            }
        }

        // 取消进程
        @Override
        public void cancel() {

        }
    }
}
