package com.lgcns.newspacegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NewspaceGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewspaceGatewayApplication.class, args);
    }

}
