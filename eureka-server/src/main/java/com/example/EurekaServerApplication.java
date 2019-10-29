package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * springboot的
 * Description:
 * @SpringBootApplication 声明该类是spring boot的服务的入口
 * @EnableEurekaServer 声明该类是一个 Eureka Server 微服务，提供服务注册和服务发现功能，即为注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
