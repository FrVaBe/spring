# Spring Cloud Config Client Demo

This is a Spring Cloud Config Client example project. It can be build and started as follows

```
.../spring-cloud-config-client-demo>mvn clean install
.../spring-cloud-config-client-demo>java -jar target/spring-cloud-config-client-demo-0.0.1-SNAPSHOT.jar
```

**Requirement**

A running [spring-cloud-config-server-demo](../spring-cloud-config-server-demo) process is expected.

**What happens**

The message that was configured as `message` property in the spring-cloud-config-server demo is printed (in an endless loop) to the console. 

```
Started: Wed May 31 10:57:10 CEST 2017; message: Hello World!
Started: Wed May 31 10:57:10 CEST 2017; message: Hello World!
Started: Wed May 31 10:57:10 CEST 2017; message: Hello World!
Started: Wed May 31 10:57:10 CEST 2017; message: Hello World!
Started: Wed May 31 10:57:10 CEST 2017; message: Hello World!
Started: Wed May 31 10:57:10 CEST 2017; message: Hello World!
...
```

**Refresh configuration**

The configuration can be changed at the [spring-cloud-config-server-demo](../spring-cloud-config-server-demo) by modifying the `message` property value in the configuration git repository. To make the client aware of a configuration change the [Spring Boot Actuator](http://docs.spring.io/spring-boot/docs/1.5.3.RELEASE/reference/htmlsingle/#production-ready) refresh endpoint can be used. In this client demo project the Actuator API is exposed via http, and a

    curl -X POST http://localhost:8080/refresh

will update the client configuration and inject a new bean instance with the updated configuration to the Spring context (by the way, beans that should support refresh during runtime must be annotated with `@RefreshScope`).

After the refresh the new message will be printed to the console.