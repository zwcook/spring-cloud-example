package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Title: ZuulApplication
 * Description:
 * // @EnableZuulProxy 生成网关代理 内部包含@EnableZuulServer
 * // @EnableAutoConfiguration 可以帮助springboot 应用将所有符合条件的 @Configuration
 *  配置加载到当前spring boot 创建并使用 ioc容器中
 */

@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
