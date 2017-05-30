# Spring Cloud Config Server Demo

This is a Spring Cloud Config Server example project. It can be build and started as follows

```
.../spring-cloud-config-server-demo>mvn clean install
.../spring-cloud-config-server-demo>java -jar target\spring-cloud-config-server-demo-0.0.1-SNAPSHOT.jar
```

**Requirement**

A git repository with a file `spring-cloud-config-client-demo.properties` must be availabe. The file must contain the property

```
message = Hello World!
```

The config server configuration needs to point to this git repository with (also see [application.properties](src/main/resources/application.properties)):

```
spring.cloud.config.server.git.uri=c:/FrVaBe/src/spring/spring-cloud-config-demo/spring-cloud-config-server-repro
```
