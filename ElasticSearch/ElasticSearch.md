# ElasticSearch

![ElatisSearch](https://github.com/WHRayLee/ReadBook/blob/main/ElasticSearch/ElasticSearch.png)

![ElatisSearch水平扩展](https://github.com/WHRayLee/ReadBook/blob/main/ElasticSearch/%E6%B0%B4%E5%B9%B3%E6%89%A9%E5%B1%95.png)

## 日志管理
- 日志搜集
- 格式化分析
- 全文检索
- 风险告警

![ElatisSearch与其他数据库集成](https://github.com/WHRayLee/ReadBook/blob/main/ElasticSearch/ElasticSearch%E4%B8%8E%E6%95%B0%E6%8D%AE%E5%BA%93%E9%9B%86%E6%88%90.png)

![ElasticSearch日志分析](https://github.com/WHRayLee/ReadBook/blob/main/ElasticSearch/%E6%97%A5%E5%BF%97%E5%88%86%E6%9E%90.png)

## Elasticsearch的分布式架构
> Elasticsearch的分布式架构的好处
    1. 存储的水平扩容
    2. 提高系统的可用性，部分节点停止服务，整个集群的服务不受影响

1. 不同的集群通过不同的名字来区分，默认名字“elasticsearch”
2. 通过配置文件修改，或者在命令行中`-E cluster.name=geektime`进行设定
3. 一个集群可以有一个或者多个节点
    > 本质上就是一个JAVA进程
    > 每一个节点都有名字，通过配置文件配置，或者启动时候`-E node.name`=node指定
    > 每一个节点在启动之后，会分配一个`UID`，保存在data目录下

## Master-eligible nodes和Master Node
- 每个节点启动后，默认就是一个Master eligible节点, 可以设置`node.master：false`禁止

- Master一eligible节点可以参加选主流程
    1. 成为Master节点当第一个节点启动时候，它会将自己选举成Master节点
    2. 每个节点上都保存了集群的状态
    3. 只有Master节点才能修改集群的状态信息

- 集群状态（Cluster State），
    1. 维护了一个集群中，必要的信息所有的节点信息, 所有的索引和其相关的Mapping与Setting信息分片的路由信息
    2. 任意节点都能修改信息会导致数据的不一致性

## Data Node Coordinating Node
- Data Node
    1. 可以保存数据的节点，叫做Data Node。负责保存分片数据。在数据扩展上起到了至关重要的作用
- Coordinating Node
    1. 负责接受Client的请求，将请求分发到合适的节点，最终把结果汇集到一起
    2. 每个节点默认都起到了Coordinating Node的职责

## 其他的节点类型

- Hot&Warm Node
    1. 不同硬件配置的Data Node，用来实现Hot&Warm架构，降低集群部署的成本
- Machine Learning Node
    1. 负责跑机器学习的Job，用来做异常检测
- Tribe Node
    1.（⑤.3开始使用Cross Cluster Serarch）Tribe Node连接到不同的Elasticsearch集群，并且支持将这些集群当成一个单独的集群处理

节点类型	配置参数	默认值
maste eligible	node.master	tru Je
data	node.data I	true
ingest	node.ingest	tu ure
coordinating only	无	每个节点默认都是coordinating 节点。 设置其他类型全部为false,
machine leaming	node. .ml	true (需enable x- -pack)

## 分片（Primary Shard&Replica Shard）

- 主分片，用以解决数据水平扩展的问题。通过主分片，可以将数据分布到集群内的所有节点之上
    1. 一个分片是一个运行的Lucene的实例
    2. 主分片数在索引创建时指定，后续不允许修改，除非Reindex
- 副本，用以解决数据高可用的问题。分片是主分片的拷贝
    1. 副本分片数，可以动态题调整
    2. 增加副本数，还可以在一定程度上提高服务的可用性（读取的吞吐）

- 对于生产环境中分片的设定，需要提前做好容量规划
    1. 分片数设置过小导致后续无法增加节点实现水品扩展
    2. 单个分片的数据量太大，导致数据重新分配耗时
    3. 分片数设置过大，7.0开始，默认主分片设置成1，解决了over-sharding的问题

1. 影响搜索结果的相关性打分，影响统计结果的准确性
2. 单个节点上过多的分片，会导致资源浪费，同时也会影响性能

![索引分片](https://github.com/WHRayLee/ReadBook/blob/main/ElasticSearch/ElasticSearch%E5%88%86%E7%89%87.png)

## ElasticSearch 文件目录结构
- bin
> 脚本文本，包括启动elasticsearch，安装插件

- config
> elasticsearch.yml
> 集群配置文件

- JDK
> Java运行环境

- data
> path.data
> 数据文件

- lib
> Java类库

- logs
> path.log
> 日志文件

- modules
> 包含所有ES模块

- plugins
> 包含所有已安装插件

### 启动 ElasticSearch
- web访问
```bash
localhost:9200
```

- 安装插件
```bash
# 查看安装了哪些插件
elasticsearch-plugin list

# 安装插件
elasticsearch-plugin install analysis-icu
```

- web 查看插件
```bash
localhost:9200/plugins/_cat
```

- 运行多个ElasticSearch实例
```bash
elasticsearch -E node.name=node1 -E cluster.name=geektime -E path.data=node1_data -d
elasticsearch -E node.name=node2 -E cluster.name=geektime -E path.data=node2_data -d
elasticsearch -E node.name=node3 -E cluster.name=geektime -E path.data=node3_data -d
```

- web 查看运行节点
```bash
localhost:9200/_cat/nodes
```

### 启动 Kibana
- web访问
```bash
localhost:5601
```

- 安装插件
```bash
# 查看安装了哪些插件
kibana-plugin list

# 安装插件
kibana-plugin install plugin_name

# 删除插件
kibana-plugin remove
```

### 安装 LogStash


## ElasticSearch基本概念
### 文档 Document
1. 文档是所有可搜索数据的最小单位
2. 文档会被序列化城json格式，保存在ElasticSearch中
    a) json对象由字段组成，ElasticSearch的类型可以自动推断
    b) 字段是有类型的，ElasticSearch支持数组和嵌套
3. 每个文档都有一个 Unique ID



### 文档元数据
- _index: 文档所属的索引名
- _type：文档所属的类型名
- _id： 文档唯一ID
- _source：文档的原始json
- _all：整合所有字段内容到该字段，已经废除
- _version： 文档的版本
- _source： 文档的相关性

### 索引
> 文档的容器，是一类文档的结合
- 体现了逻辑空间概念，每个索引都有自己的mapping定义，用于定义包含的文档的字段名和字段类型
- 索引中的数据分散在shard上
- 索引的mapping与settings
    a) mapping定义文档字段的类型
    b) setting定义不同的数据分布

![索引](https://github.com/WHRayLee/ReadBook/blob/main/ElasticSearch/ElasticSearch%E7%B4%A2%E5%BC%95.png)

RDBMS	|Elasticsearch
Table	|Index(Type)
Row	|Doucment
Column|	Filed
Schema|	Mapping
SQL	|DSL

### API
![](https://github.com/WHRayLee/ReadBook/blob/main/ElasticSearch/ElasticSearch%E7%9A%84restful%20API.png)
- indices
    a) 创建索引
    ```bash
    put index_name
    ```

    b) 查看所有index
    ```bash
    _cat/indices
    ```

- 查看集群健康状况
    ```bash
    http://localhost:9200/_cluster/health
    ```

    ```bash
    http://localhost:9200/_cat/nodes
    ```

    ```bash
    GET _cluster/health
    ```

    ```json
    {
    "cluster_name" : "elasticsearch",
    "status" : "green",
    "timed_out" : false,
    "number_of_nodes" : 1,
    "number_of_data_nodes" : 1,
    "active_primary_shards" : 7,
    "active_shards" : 7,
    "relocating_shards" : 0,
    "initializing_shards" : 0,
    "unassigned_shards" : 0,
    "delayed_unassigned_shards" : 0,
    "number_of_pending_tasks" : 0,
    "number_of_in_flight_fetch" : 0,
    "task_max_waiting_in_queue_millis" : 0,
    "active_shards_percent_as_number" : 100.0
    }

    ```
    1. Green-主分片与副本都正常分配
    2. Yellow-主分片全部正常分配，有副本分片未能正常分配
    3. Red-有主分片未能分配

    ```bash
    GET _cat/nodes
    ```

    ```json
    127.0.0.1 32 98 7 2.03   cdfhilmrstw * iMac-3.local
    ```

    ```bash
    GET _cat/shards
    ```

    ```json
    .kibana_7.15.2_001                  0 p STARTED 31   2.7mb 127.0.0.1 iMac-3.local
    .geoip_databases                    0 p STARTED 42  40.8mb 127.0.0.1 iMac-3.local
    .ds-ilm-history-5-2021.11.29-000001 0 p STARTED            127.0.0.1 iMac-3.local
    .kibana-event-log-7.15.2-000001     0 p STARTED  1     6kb 127.0.0.1 iMac-3.local
    .apm-custom-link                    0 p STARTED  0    208b 127.0.0.1 iMac-3.local
    .kibana_task_manager_7.15.2_001     0 p STARTED 14 148.7kb 127.0.0.1 iMac-3.local
    .apm-agent-configuration            0 p STARTED  0    208b 127.0.0.1 iMac-3.local
    ```
