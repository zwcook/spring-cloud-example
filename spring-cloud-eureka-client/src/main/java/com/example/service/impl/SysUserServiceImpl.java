package com.example.service.impl;

import com.example.entity.SysUser;
import com.example.service.SysUserService;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Title: SysUserServiceImpl
 * Description: TODO
 * projectName spring-cloud-02
 *
 * @author zhaow
 * @version V1.0
 * @date 2019-10-28
 */
@Repository
public class SysUserServiceImpl implements SysUserService {
    private static ConcurrentHashMap<Long,SysUser> sysUserMap;
    static {
        sysUserMap = new ConcurrentHashMap<>();
        sysUserMap.put(1L,new SysUser(1L,"张三","db1"));
        sysUserMap.put(2L,new SysUser(2L,"李四","db1"));
        sysUserMap.put(3L,new SysUser(3L,"王五","db1"));
    }
    @Override
    public Collection<SysUser> findAll() {
        return sysUserMap.values();
    }

    @Override
    public SysUser findById(long id) {
        return sysUserMap.get(id);
    }

    @Override
    public void saveOrUpdate(SysUser sysUser) {
        sysUserMap.put(sysUser.getUserId(),sysUser);
    }

    @Override
    public void delById(long id) {
        sysUserMap.remove(id);
    }
}
