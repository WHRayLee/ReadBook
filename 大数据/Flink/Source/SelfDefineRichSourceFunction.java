package com.raylee.demo.Lesson02;

import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.source.RichSourceFunction;


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
        private Integer subTaskNum;
        private Integer count = 0;
        @Override
        public void run(SourceContext<String> ctx) throws Exception {
            while (true) {
                ctx.collect(subTaskNum + "->" + count);
                count++;
            }
        }

        @Override
        public void cancel() {

        }

        @Override
        public void open(Configuration parameters) throws Exception {
            System.out.println("打开");
            subTaskNum = getRuntimeContext().getIndexOfThisSubtask();
        }
    }
}
