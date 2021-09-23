package com.cloud.micro.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@EnableEurekaServer
@SpringBootApplication

public class MicroServerApplication {
    @RequestMapping("/index")
    public String test() {
        return "success";
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroServerApplication.class, args);
    }

}
