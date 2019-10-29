package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: NativeConfigHandler
 * Description: TODO
 * projectName spring-cloud-02
 *
 * @author zhaow
 * @version V1.0
 * @date 2019-10-29
 */
@RestController
@RequestMapping("/config")
public class NativeConfigHandler {
    @Value("${server.port}")
    private String port;
    @Value("${foo}")
    private String foo;

    @GetMapping("/index")
    public String index() {
        return this.port+"-"+this.foo;
    }
}
