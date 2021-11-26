1. go-micro: 一个Golang微服务开发框架。它是核心。 开发者可以利用它快速开发出微服务。这些微服务最常见的形态是 gRPC

2.micro: 一个命令行工具。 虽非必须， 但它可以为Micro开发和管理提供很多便利。 例如， 生成模板项目， 查看服务运行状态， 调用服务等。 

## go-micro的架构
![架构图](https://github.com/WHRayLee/ReadBook/blob/main/Golang/Micro%E6%9E%B6%E6%9E%84%E5%9B%BE.png)

> Service 是系统中最核心的接口， 它负责将其它接口有机地组织在一起

### 服务发现
>  默认实现基于 组播DNS(mdns)， 无需任何配置，开箱即用

`github.com/micro/go-micro/v2/registry/Registry`

### 异步消息
> 异步消息是降低耦合、提高系统鲁棒性的关键技术

`github.com/micro/go-micro/v2/broker/Broker`

### 编解码
> 编解码定义了微服务之间通讯的消息传输格式

`github.com/micro/go-micro/v2/codec/Codec`

- Server， 定义微服务的服务器
- Transport， 定义传输协议
- Selector，定义服务选择逻辑， 可以灵活地实现各种负载均衡策略
- Wrapper，定义包装服务器和客户端请求的中间件

## 创建项目

```bash
micro new --namespace=com.foo --gopath=false hello
```
- micro new 代表调用micro工具的new命令，创建一个gRPC服务
- --namespace=com.foo 指定了此服务的名称空间
- --gopath=false 表明把代码生成到当前目录，而不是 $GOPATH
- hello 为服务名称

```bash
brew install protobuf

iMac-2:~ yons$ which protoc
/usr/local/bin/protoc

go get -u github.com/golang/protobuf/{proto,protoc-gen-go}
```

> protoc-gen-micro，它不属于Protobuf核心，它是Micro团队开发的代码生成器， 专门用于生成Micro相关代码

```bash
make build && ./hello-service
```

## 使用micro 命令行工具调用服务
```bash
micro list services
```
>调用前可以先用get子命令查看这个服务的详细情况，其中包含了服务版本、接口定义、运行节点等信息

```bash
micro get service com.foo.service.hello
```

> 发起调用

```bash
micro call com.foo.service.hello Hello.Call '{"name": "Bill"}'
```


## 服务发现
> 只需在项目启动时指定两个参数
- registry，指定注册中心类型，这里我们指定为etcd。环境变量$MICRO_REGISTRY 作用与此参数相同。
- registry_address，指定注册中心地址，多个地址用逗号分隔。环境变量$MICRO_REGISTRY_ADDRESS 作用与此参数相同

```bash
go run main.go plugin.go --registry=etcd --registry_address=etcd1.foo.com:2379,etcd2.foo.com:2379,etcd3.foo.com:2379
```

```bash
micro web --registry=etcd --registry_address=etcd1.foo.com:2379,etcd2.foo.com:2379,etcd3.foo.com:2379
```

```bash
micro get service com.foo.service.hello --registry=etcd --registry_address=etcd1.foo.com:2379,etcd2.foo.com:2379,etcd3.foo.com:2379
```

```bash
go run main.go plugin.go --registry=consul --registry_address=consul1.foo.com:8300,consul2.foo.com:8300,consul3.f
oo.com:8300
```
> plugin.go 的空文件， 这是Micro约定用来导入插件的地方

```bash
package main

import (
   _ "github.com/micro/go-plugins/registry/consul/v2"
)
```

```bash
require (
   github.com/golang/protobuf v1.3.2
   github.com/micro/go-micro/v2 v2.4.0
   github.com/micro/go-plugins/registry/consul/v2 v2.3.0 // indirect   
)
```