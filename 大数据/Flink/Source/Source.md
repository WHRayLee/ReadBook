# Source
1. 基于集合的Source: `fromElements`
2. 基于Socket网络端口的Source: 
3. 基于文件的Source
4. 第三方Connector Source
5. 自定义Source

> 只要调用StreamExecutionEnvironment的对应方法就可以创建DataStream


- 非并行的Source:并行度只能为1
- 并行的Source

## 本地查看UI
```xml
<dependency>
  <groupId>org.apache.flink</groupId>
  <artifactId>flink-runtime-web_${scala.binary.version}</artifactId>
  <version>${flink.version}</version>
</dependency>
```

> 单并行度的使用了`SourceFunction`

> 多并行度的使用 `RichParallelSourceFunction`


## Kakfa连接器
```xml
      <dependency>
        <groupId>org.apache.flink</groupId>
        <artifactId>flink-connector-kafka_2.12</artifactId>
        <version>${flink.version}</version>
      </dependency>
```
