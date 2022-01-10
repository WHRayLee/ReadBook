package com.raylee.demo.Lesson01;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

public class demoV2 {
    public static void main(String[] args) throws Exception {
        // 获取流计算的运行环境
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        ParameterTool parameterTool = ParameterTool.fromArgs(args);
        String hostname = parameterTool.get("hostname", "localhost");
        int port = parameterTool.getInt("port", 9999);

        // source
        DataStreamSource<String> dataSource = env.socketTextStream(hostname, port);
        // Transform
        SingleOutputStreamOperator<Tuple2<String, Integer>> result = dataSource.flatMap(new FlatMapFunction<String, Tuple2<String, Integer>>() {

            @Override
            public void flatMap(String line, Collector<Tuple2<String, Integer>> out) throws Exception {
                String[] words = line.split(",");
                for (String word : words) {
                    out.collect(Tuple2.of(word, 1));
                }
            }
        }).keyBy(0).sum(1);
        // slot 跟槽的个数相同，相同的key可以进入同一个槽
        result.print().setParallelism(1);
        String simpleName = demoV2.class.getSimpleName();
        // 抛异常，执行重启策略
        env.execute(simpleName);
    }
}
