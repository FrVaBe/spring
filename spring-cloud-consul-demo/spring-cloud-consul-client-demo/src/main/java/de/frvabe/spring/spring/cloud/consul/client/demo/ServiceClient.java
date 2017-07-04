package de.frvabe.spring.spring.cloud.consul.client.demo;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.client.RestTemplate;

public class ServiceClient {

    private String serviceName;
    private DiscoveryClient discoveryClient;

    public ServiceClient(final String serviceName, final DiscoveryClient discoveryClient) {
        this.serviceName = serviceName;
        this.discoveryClient = discoveryClient;
    }

    public String getMessageFromService(final String name) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl() + "/greeting/" + name, String.class);
    }

    private String serviceUrl() {
        List<ServiceInstance> list = discoveryClient.getInstances(serviceName);
        if (!list.isEmpty()) {
            System.out.println("discovered serviceUrl: " + list.get(0).getUri());
            return list.get(0).getUri().toString();
        }
        return null;
    }

}
