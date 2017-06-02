package de.frvabe.spring.spring.cloudnetflix.eureka.client.demo;

import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

public class ServiceClient {

    private String serviceName;
    private EurekaClient discoveryClient;

    public ServiceClient(final String serviceName, final EurekaClient discoveryClient) {
        this.serviceName = serviceName;
        this.discoveryClient = discoveryClient;
    }

    public String getMessageFromService(final String name) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl() + "/greeting/" + name, String.class);
    }

    private String serviceUrl() {
        InstanceInfo instance = discoveryClient.getNextServerFromEureka(serviceName, false);
        System.out.println("discovered serviceUrl: " + instance.getHomePageUrl());
        return instance.getHomePageUrl();
    }

}
