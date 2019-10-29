package com.example.feign.impl;

import com.example.entity.SysUser;
import com.example.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Title: FeignError
 * Description: TODO
 * projectName spring-cloud-02
 *
 * @author zhaow
 * @version V1.0
 * @date 2019-10-29
 */

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<SysUser> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中";
    }
}
