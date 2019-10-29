package com.example.service;

import com.example.entity.SysUser;

import java.util.Collection;

/**
 * Title: SysUserService
 * Description: TODO
 * projectName spring-cloud-02
 *
 * @author zhaow
 * @version V1.0
 * @date 2019-10-28
 */
public interface SysUserService {
    public Collection<SysUser> findAll();
    public SysUser findById(long id);
    public void saveOrUpdate(SysUser sysUser);
    public void delById(long id);
}
