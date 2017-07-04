package de.frvabe.spring.spring.cloud.consul.service.demo.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/greeting")
public class GreetingController {

    @RequestMapping("/{name}")
    public String home(@PathVariable final String name) {
        return "Hello " + name + "!";
    }

}
