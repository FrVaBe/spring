# Spring Cloud Config Server Demo

This is a Spring Cloud Config Server example project. It can be build and started as follows

```
.../spring-cloud-config-server-demo>mvn clean install
.../spring-cloud-config-server-demo>java -jar target/spring-cloud-config-server-demo-0.0.1-SNAPSHOT.jar
```

**Requirement**

A git repository with a file `spring-cloud-config-client-demo.properties` (because _spring-cloud-config-client-demo_ is the `spring.application.name` of our config client application) must be availabe. The file must contain the `message` property with some value.

```
message = Hello World!
```

The config server configuration needs to point to this git repository with (also see [application.properties](src/main/resources/application.properties)):

```
spring.cloud.config.server.git.uri=c:/FrVaBe/src/spring/spring-cloud-config-demo/spring-cloud-config-server-repro
```

**Testing**

To check the managed configuration for the _spring-cloud-config-client-demo_ application 

    http://localhost:8888/spring-cloud-config-client-demo/default

can be used.