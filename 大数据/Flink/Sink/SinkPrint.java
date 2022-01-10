package com.raylee.demo.Lesson03;

import org.apache.flink.api.common.functions.RuntimeContext;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.sink.RichSinkFunction;
import scala.sys.process.ProcessBuilder;

public class SinkPrint {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.createLocalEnvironmentWithWebUI(new Configuration());
        env.setParallelism(2);
        ParameterTool parameterTool = ParameterTool.fromArgs(args);
        String hostname = parameterTool.get("hostname", "localhost");
        int port = parameterTool.getInt("port", 9999);
        DataStreamSource<String> data = env.socketTextStream(hostname, port);

        // name 指定输出的名字
        data.addSink(new MySink()).name("mySink");

        env.execute(ProcessBuilder.Sink.class.getSimpleName());
    }

    private static class MySink extends RichSinkFunction<String> {
        private int indexOfThisSubtask;
        @Override
        public void open(Configuration parameters) throws Exception {
            // 获取子任务的相关信息
            RuntimeContext runtimeContext = getRuntimeContext();
            indexOfThisSubtask = runtimeContext.getIndexOfThisSubtask();
        }

        // 输出函数
        @Override
        public void invoke(String value, Context context) throws Exception {

            System.out.println("【进程号：" + indexOfThisSubtask + "】: " + value);
        }
    }
}
