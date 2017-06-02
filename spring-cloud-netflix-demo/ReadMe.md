# Spring Cloud Netflix Demo

This repro contains some demo application for dealing with [Spring Cloud Netflix](http://cloud.spring.io/spring-cloud-static/Dalston.SR1/#_spring_cloud_netflix).  
It will be extended as needed ;-)

**helpful references**:
* Spring Cloud Netflix [reference documentation](http://cloud.spring.io/spring-cloud-static/Dalston.SR1/#_spring_cloud_netflix) 
* [Getting Started Service Registration and Discovery](https://spring.io/guides/gs/service-registration-and-discovery/) from the Spring Guides



## Spring Cloud Netflix **Eureka** Demo

This is a demo application setup to demonstrate the usage of the [Spring Cloud Netflix Eureka](http://cloud.spring.io/spring-cloud-static/Dalston.SR1/#_spring_cloud_netflix) support.

It contains the following projects

|Modul                           |Description                                      |
|--------------------------------|-------------------------------------------------|
|[spring-cloud-netflix-eureka-server-demo](spring-cloud-netflix-eureka-server-demo)|a _Spring Cloud Eureka Server_ application which offers _Service Registration_ and _Discovery_ features|
|[spring-cloud-netflix-eureka-service-demo](spring-cloud-netflix-eureka-service-demo)|a service demo that registers itself at the Spring Cloud Netflix Eureka Server demo application|
|[spring-cloud-netflix-eureka-client-demo](spring-cloud-netflix-eureka-client-demo)|a service client which request the service connection parameters from the Spring Cloud Netflix Eureka Server demo application|

To start the demo clone the repository and start the applications one after another with

    mvn spring-boot:run

Have a look for further details at the ReadMe page of each individual application.
