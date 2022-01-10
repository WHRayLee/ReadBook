package com.raylee.demo.Lesson02;

import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;

import java.util.Properties;

public class KafkaSource {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.createLocalEnvironmentWithWebUI(new Configuration());
        env.setParallelism(4);
        // 设置kafka的参数
        Properties properties = new Properties();
        // kafka服务器地址
        // 端口号：9092
        // 多个地址
        properties.setProperty("bootstrap.servers","localhost:9092,");
        // 读取偏移量策略： 如果没有没有记录偏移量，则从头开始读
        // 如果记录偏移量，就会偏移量开始读
        properties.setProperty("auto.offset.reset","earliest");
        // 设置消费组ID
        properties.setProperty("group.id","gl");
        // 没有开始checkpoint，让flink提交偏移量的消费者定期自动提交偏移量
        // 会存在风险，flink只是将相关数据存到kafka指定的一个topic中
        properties.setProperty("enable.auto.commit", "true");
        // 创建FlinkKafkaConsumer并传入相关参数
        FlinkKafkaConsumer<String> kafkaConsumer = new FlinkKafkaConsumer<>("topic-name", // topic地址
                new SimpleStringSchema(), // 序列化模式
                properties) // kafka的指定参数
                ;
        DataStreamSource<String> data = env.addSource(kafkaConsumer);
        int parallelism = data.getParallelism();
        System.out.println("并行度：" + parallelism);
        data.print();
        env.execute(KafkaSource.class.getSimpleName());
    }
}
