package com.cloud.micro.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
@EnableEurekaClient
public class MicroDataApplication {
    @RequestMapping("/index")
    public String test() {
        return "success";
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroDataApplication.class, args);
    }

}
