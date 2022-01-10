package com.raylee.demo.Lesson01;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.functions.KeySelector;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.KeyedStream;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

public class demo {
    public static void main(String[] args) throws Exception {
        // 获取流计算的运行环境
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        ParameterTool parameterTool = ParameterTool.fromArgs(args);
        String hostname = parameterTool.get("hostname", "localhost");
        int port = parameterTool.getInt("port", 9999);

        // source
        DataStreamSource<String> dataSource = env.socketTextStream(hostname, port);
        // Transform
        SingleOutputStreamOperator<String> words = dataSource.flatMap(new FlatMapFunction<String, String>() {
            @Override
            public void flatMap(String line, Collector<String> out) throws Exception {
                String[] words = line.split(",");
                for (String word : words
                ) {
                    out.collect(word);
                }
            }
        });
        SingleOutputStreamOperator<Tuple2<String, Integer>> wordAddOne = words.map(new MapFunction<String, Tuple2<String, Integer>>() {

            @Override
            public Tuple2<String, Integer> map(String word) throws Exception {
                return Tuple2.of(word, 1);
            }
        });
        // KeyBy 实现 KeySelector
        KeyedStream<Tuple2<String, Integer>, String> wordAddOneKeyByFirstWord = wordAddOne.keyBy(new KeySelector<Tuple2<String, Integer>, String>() {
            @Override
            public String getKey(Tuple2<String, Integer> in) throws Exception {
                return in.f0;
            }
        });
        SingleOutputStreamOperator<Tuple2<String, Integer>> result = wordAddOneKeyByFirstWord.sum(1);
        result.print().setParallelism(1);
        String simpleName = demo.class.getSimpleName();
        // 抛异常，执行重启策略
        env.execute(simpleName);
    }
}
