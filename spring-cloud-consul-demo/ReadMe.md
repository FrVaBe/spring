# Spring Cloud Consul Demo

## Preface

This repro contains some demo application for dealing with [Spring Cloud Consul](http://cloud.spring.io/spring-cloud-static/Dalston.SR1/#_spring_cloud_consul).  
It will be extended as needed ;-)

**helpful references**
* [Consul](https://www.consul.io/intro/index.html)
* Spring Cloud Consul [reference documentation](http://cloud.spring.io/spring-cloud-static/Dalston.SR1/#_spring_cloud_consul) 


## Demo Setup

This is a demo application setup to demonstrate the usage of the [Spring Cloud Consul](http://cloud.spring.io/spring-cloud-static/Dalston.SR1/#_spring_cloud_consul) support.

It contains the following projects

|Modul                           |Description                                      |
|--------------------------------|-------------------------------------------------|
|[spring-cloud-consul-service-demo](spring-cloud-consul-service-demo)|a service demo that registers itself at a running Consul Service Discovery System|
|[spring-cloud-consul-client-demo](spring-cloud-consul-client-demo)|a service client which request the service connection parameters from the Consul Service Discovery System|

**Precondition**

* a Consul server must be running on localhost using the default ports; in this case the Consul UI is available at [http://localhost:8500](http://localhost:8500)
  * on Windows just unzip the [downloaded](https://www.consul.io/downloads.html) executable and start Consul with  
  `$ ./consul.exe agent -dev`

**Demo start**

To start the demo clone the repository and start the applications one after another with

    mvn spring-boot:run

Have a look for further details at the ReadMe page of each individual application.
