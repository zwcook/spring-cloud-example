package com.example.feign;

import com.example.entity.SysUser;
import com.example.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * Title: FeignProvider
 * Description: @FeignClient 表示当前接口访问微服务 配置访问那些服务，value等于服务名
 */

@FeignClient(value = "provider")
public interface FeignProviderClient {
    @GetMapping("/sysUser/findAll")
    public Collection<SysUser> findAll();
    @GetMapping("/sysUser/index")
    public String index();
}
