# Spring Cloud Consul Client Demo

This application is a demo service client which invokes a simple method of a service.
The connection parameter (URI) which is necessary to connect to the service is requested fom a [Consul](https://www.consul.io) server.  
The client demo is part of this [Spring Cloud Consul demo setup](..).

**Preconditions**

* a Consul server must be running on localhost using the default ports; in this case the Consul UI is available at [http://localhost:8500](http://localhost:8500)
* the [spring-cloud-consul-service-demo](../spring-cloud-consul-service-demo) must be running (and have registered itself at the Consul server)


**Start**

To start the application on a local development machine use

    .../spring-cloud-consul-client-demo>mvn spring-boot:run

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

Terminate and/or Restart the _Consul Server_ or the _spring-cloud-consul-service-demo_ to see what happens...
