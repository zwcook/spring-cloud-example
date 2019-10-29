package com.example.controller;

import com.example.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * Title: RibbonHandler
 * Description: TODO
 * projectName spring-cloud-02
 *
 * @author zhaow
 * @version V1.0
 * @date 2019-10-29
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<SysUser> findAll() {
        return restTemplate.getForObject("http://provider/sysUser/findAll",Collection.class);
    }
    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://provider/sysUser/index",String.class);
    }
}
