package com.alex.dotaconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DotaConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(DotaConfigApplication.class, args);
    }

}
