# Spring Cloud Consul Service Demo

This application is a service demo that registers itself at a [Consul](https://www.consul.io/) Service Discovery Server. It uses [Spring Cloud Consul](http://cloud.spring.io/spring-cloud-static/Dalston.SR1/#_spring_cloud_consul) to do so.  
It is part of this [Spring Cloud Consul demo setup](..).

**Precondition**

* a Consul server must be running on localhost using the default ports; in this case the Consul UI is available at [http://localhost:8500](http://localhost:8500)

**Start**

To start the application on a local development machine use

    .../spring-cloud-consul-service-demo>mvn spring-boot:run

**What happens**

The service will startup and register itself at the _Consul_ server.  
The service itself offers a [greeting](src/main/java/de/frvabe/spring/spring/cloud/consul/service/demo/rest/GreetingController-java) REST resource which can be called by clients ([http://localhost:8080/greeting/FooBar](http://localhost:8080/greeting/FooBar)).
