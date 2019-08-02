package com.microservice.edu;

import com.microservice.edu.service.DeptClientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages="com.microservice.edu")
@EnableEurekaClient
//@EnableFeignClients(basePackages = {"com.microservice.edu"})
@EnableFeignClients(clients = DeptClientService.class)
public class DeptConsumer80_Feign_App {

    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
    }

}
