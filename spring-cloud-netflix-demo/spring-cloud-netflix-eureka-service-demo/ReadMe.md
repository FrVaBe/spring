# Spring Cloud Netflix Eureka Service Demo

This application is a service demo that registers itself at the _[Spring Cloud Netflix Eureka Server](../spring-cloud-netflix-eureka-server-demo)_ application.  
It is part of this [Spring Cloud Netflix Eureka demo setup](..).

**Start**

To start the application on a local development machine use

    .../spring-cloud-netflix-eureka-service-demo>mvn spring-boot:run

**What happens**

The service will startup and register itself at the Eureka server.  
The service itself offers a [greeting](src/main/java/de/frvabe/spring/spring/cloudnetflix/eureka/service/demo/rest/GreetingContr) REST resource which can be called by clients ([http://localhost:8080/greeting/FooBar](http://localhost:8080/greeting/FooBar)).
