# Spring Cloud Netflix Eureka Client Demo

This application is a demo service client which invokes a simple method of a service.
The connection parameter (URI) which is necessary to connect to the service is requested fom the [Eureka Server](../spring-cloud-netflix-eureka-server-demo).  
The client demo is part of this [Spring Cloud Netflix Eureka demo setup](..).

**Start**

To start the application on a local development machine use

    .../spring-cloud-netflix-eureka-client-demo>mvn spring-boot:run

**What happens**

The demo application will start and print a greeting message to the console (in an endless loop).

```
discovered serviceUrl: http://my-machine:8080/
Hello FooBar!
discovered serviceUrl: http://my-machine:8080/
Hello FooBar!
discovered serviceUrl: http://my-machine:8080/
Hello FooBar!
```

Terminate or Restart the [Eureka Server](../spring-cloud-netflix-eureka-server-demo) or the [demo service](../spring-cloud-netflix-eureka-service-demo) to see what happens...
