# Spring Cloud Config Demo

This is a project setup to test and demonstrate the _Spring Cloud Config_ probabilities. It contains two projects
* **[spring-cloud-config-server-demo](spring-cloud-config-server-demo)** - a config server example
* **[spring-cloud-config-client-demo](spring-cloud-config-client-demo)** - a config client example


**References**:
* Getting Started - [Centralized Configuration](https://spring.io/guides/gs/centralized-configuration/)
* [Spring Cloud](http://projects.spring.io/spring-cloud/) ([SpringCloudConfig](http://cloud.spring.io/spring-cloud-static/Dalston.SR1/#_spring_cloud_config))

## [spring-cloud-config-demo](spring-cloud-config-demo)

The Config Server. Build and start as follows

```
.../spring-cloud-config-server-demo>mvn clean install
.../spring-cloud-config-server-demo>java -jar target\spring-cloud-config-server-demo-0.0.1-SNAPSHOT.jar
```

**Requirement**

A git repository with a file `spring-cloud-config-client-demo.properties` must be availabe. The file must contain the property

```
message = Hello World!
```

The config server configuration needs to point to this git repository with (see [application.properties](spring-cloud-config-server-demo/src/main/resources/application.properties))

```
spring.cloud.config.server.git.uri=c:/FrVaBe/src/spring/spring-cloud-config-demo/spring-cloud-config-server-repro
```
