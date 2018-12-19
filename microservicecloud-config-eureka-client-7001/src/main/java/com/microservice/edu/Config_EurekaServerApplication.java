package com.microservice.edu;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableApolloConfig
public class Config_EurekaServerApplication  {

    public static void main(String[] args) {
        SpringApplication.run(Config_EurekaServerApplication.class,args);
    }

}
