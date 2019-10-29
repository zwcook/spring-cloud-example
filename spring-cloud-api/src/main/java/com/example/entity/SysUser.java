package com.example.entity;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * Title: SysUser
 * Description: TODO
 * projectName spring-cloud-02
 *
 * @author zhaow
 * @version V1.0
 * @date 2019-10-28
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Accessors(chain = true)
public class SysUser {
    @Getter
    @Setter
    private long userId;
    @Getter
    @Setter
    private String userName;
    @Getter
    @Setter
    private String dbAddress;

    public static void main(String[] args) {
        new SysUser(1,"","").setUserId(2).setUserName("用户二").setDbAddress("db123");
    }
}
