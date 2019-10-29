package com.example.controller;

import com.example.RestTemplateApplication;
import com.example.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * Title: RestHandler
 * Description: TODO
 * projectName spring-cloud-02
 *
 * @author zhaow
 * @version V1.0
 * @date 2019-10-28
 */
@RestController
@RequestMapping("/rest")
public class RestHandler {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<SysUser> findAll () {
        return restTemplate.getForEntity("http://localhost:8010/sysUser/findAll",Collection.class).getBody();
    }

    @GetMapping("/findAll2")
    public Collection<SysUser> findAll2 () {
        return restTemplate.getForObject("http://localhost:8010/sysUser/findAll",Collection.class);
    }

    @GetMapping("/findById/{id}")
    public SysUser findById(@PathVariable("id") long id) {
//        restTemplate.getForObject("http://localhost:8010/sysUser/findById/{id}",SysUser.class,id);
        return restTemplate.getForEntity("http://localhost:8010/sysUser/findById/{id}",SysUser.class,id).getBody();
    }

    @PostMapping("/save")
    public void save(@RequestBody SysUser sysUser) {
        restTemplate.postForEntity("http://localhost:8010/sysUser/save",sysUser,null).getBody();
    }

    @PutMapping("/update")
    public void update(@RequestBody SysUser sysUser) {
        restTemplate.put("http://localhost:8010/sysUser/update",sysUser);
    }
}
