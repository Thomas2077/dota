### 服务组件
1. Service register & config center ： nacos
2. Service invocation: Feign
3. Service Circuit Breaking ： Alibaba Sentinel
4. Service Gate: Spring Gate Way
6. Tracing Analysis: Sleuth
9. Message Broker: Spring Cloud Stream
10. Message BUS: SpringCloud bus
11. Restful : p
12. Spring JPA : spring-data-commons

### 待开发模块
1. Swagger
### 注意事项
#### 1. 网关uri配置事项
```
在gateway中配置uri配置有三种方式，包括
第一种：ws(websocket)方式: uri: ws://localhost:9000
第二种：http方式: uri: http://localhost:8130/
第三种：lb(注册中心中服务名字)方式: uri: lb://brilliance-consumer
```
### 2. 