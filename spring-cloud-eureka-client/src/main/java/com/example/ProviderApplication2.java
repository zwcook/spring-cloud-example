package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Title: ProviderApplication2
 * Description: 用的时候把yml配置文件的端口改为8011 这样就能和ProviderApplication 分别启动不同的服务了
 */
@SpringBootApplication
public class ProviderApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
