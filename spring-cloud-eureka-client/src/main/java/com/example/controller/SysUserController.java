package com.example.controller;

import com.example.entity.SysUser;
import com.example.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Title: SysUserController
 * Description: TODO
 * projectName spring-cloud-02
 *
 * @author zhaow
 * @version V1.0
 * @date 2019-10-28
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    /** 读取当前工程的 服务端口 */
    @Value("${server.port}")
    private String port;
    @GetMapping("/findAll")
    public Collection<SysUser> findAll() {
        return sysUserService.findAll();
    }

    @GetMapping("/findById/{id}")
    public SysUser findById(@PathVariable("id") long id) {
        return sysUserService.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody SysUser sysUser) {
        sysUserService.saveOrUpdate(sysUser);
    }

    @PutMapping("/update")
    public void update(@RequestBody SysUser sysUser) {
        sysUserService.saveOrUpdate(sysUser);
    }

    @DeleteMapping("/delById/{id}")
    public void delById(@PathVariable("id") long id) {
        sysUserService.delById(id);
    }

    @GetMapping("/index")
    public String index() {
        return "当前端口："+this.port;
    }
}
