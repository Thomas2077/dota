package com.alex.dotaeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DotaEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DotaEurekaApplication.class, args);
        System.out.println(" eureka start success");
    }

}
