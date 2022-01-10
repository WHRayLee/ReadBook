package com.raylee.demo.Lesson02;

import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.source.RichParallelSourceFunction;

import java.util.UUID;

public class SelfDefineRichParallelSourceFunction {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        DataStreamSource<String> data = env.addSource(new MySource3());
        int parallelism = data.getParallelism();
        System.out.println("并行度：" + parallelism);
        data.print();
        env.execute(SelfDefineRichParallelSourceFunction.class.getSimpleName());
    }

    private static class MySource3 extends RichParallelSourceFunction<String> {
        public MySource3() {
            System.out.println("初始化");
        }

        private boolean isTrue = true;
        private Integer subTaskNumber;
        private Integer count = 0;

        // 发送数据
        @Override
        public void run(SourceContext<String> ctx) throws Exception {
            System.out.println("运行方法");
            while (isTrue) {
                ctx.collect(subTaskNumber + " -> " + count + " -> " + "test");
                Thread.sleep(2000);
                count++;
            }
        }

        @Override
        public void cancel() {
            System.out.println("取消方法");
            isTrue = false;
        }

        // 创建链接
        @Override
        public void open(Configuration parameters) throws Exception {
            System.out.println("打开方法");
            // subTask的编号
            subTaskNumber = getRuntimeContext().getIndexOfThisSubtask();

        }

        // 关闭链接
        @Override
        public void close() throws Exception {
            System.out.println("关闭方法");
        }
    }
}
