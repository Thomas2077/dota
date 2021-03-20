package com.alex;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringCloudApplication
@EnableFeignClients(value = "com.alex.user.feign.interfaces")
public class DotaUserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DotaUserServiceApplication.class, args);
    }
}