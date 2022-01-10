package com.raylee.demo.Lesson02;

import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.NumberSequenceIterator;

public class FromParallelSequence {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.createLocalEnvironmentWithWebUI(new Configuration());
        env.setParallelism(4);
        DataStreamSource<Long> data = env.fromParallelCollection(new NumberSequenceIterator(1L, 100L), Types.LONG);
        int parallelism = data.getParallelism();
        System.out.println("并行度情况：" + parallelism);
        data.print().setParallelism(8);

        env.execute(FromParallelSequence.class.getSimpleName());
    }
}
