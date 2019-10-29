package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Title: RestTemplateApplication
 * Description: rest调用模板工程
 */
@SpringBootApplication
public class RestTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class,args);
    }
    /**
     * <p>Title: RestTemplateApplication</p>
     * <p>Description: 把restTemplat返回给各模块使用 </p>
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
