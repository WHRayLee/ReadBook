package com.raylee.demo.Lesson03;


import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.redis.RedisSink;
import org.apache.flink.streaming.connectors.redis.common.config.FlinkJedisPoolConfig;
import org.apache.flink.streaming.connectors.redis.common.mapper.RedisCommand;
import org.apache.flink.streaming.connectors.redis.common.mapper.RedisCommandDescription;
import org.apache.flink.streaming.connectors.redis.common.mapper.RedisMapper;
import org.apache.flink.util.Collector;

import java.util.Arrays;


public class SinkRedis {
    public static void main(String[] args) throws Exception{
        StreamExecutionEnvironment env = StreamExecutionEnvironment.createLocalEnvironmentWithWebUI(new Configuration());
        env.setParallelism(2);
        ParameterTool parameterTool = ParameterTool.fromArgs(args);
        String hostname = parameterTool.get("hostname", "localhost");
        int port = parameterTool.getInt("port", 9999);
        DataStreamSource<String> data = env.socketTextStream(hostname, port);
        // 必须指定数据类型，否则后续使用将无法获得对应的数据类型
        SingleOutputStreamOperator<Tuple2<String, Integer>> flatMapResult = data.flatMap((String line, Collector<Tuple2<String, Integer>> out) -> Arrays.stream(line.split(",")).forEach(word -> out.collect(Tuple2.of(word, 1))));
        SingleOutputStreamOperator<Tuple2<String, Integer>> result = flatMapResult.keyBy(tuple -> tuple.f0).sum(1);
        // 指定 Redis的类型
        FlinkJedisPoolConfig flinkJedisPoolConfig = new FlinkJedisPoolConfig.Builder().setHost("localhost").setDatabase(8).setPassword("").build();
        // RedisSink指定的是输入类型
        result.addSink(new RedisSink<Tuple2<String, Integer>>(flinkJedisPoolConfig, new MySink()));

        env.execute(SinkRedis.class.getSimpleName());
    }

    private static class MySink implements RedisMapper<Tuple2<String, Integer>> {
        @Override
        public RedisCommandDescription getCommandDescription() {
            return new RedisCommandDescription(RedisCommand.HSET, "WORD_COUNT");
        }

        @Override
        public String getKeyFromData(Tuple2<String, Integer> in) {
            return in.f0;
        }

        @Override
        public String getValueFromData(Tuple2<String, Integer> in) {
            return in.f1.toString();
        }
    }
}
