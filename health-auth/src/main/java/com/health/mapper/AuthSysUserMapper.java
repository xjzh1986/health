package com.health.mapper;

import com.health.entity.AuthSysUser;

import java.util.List;

public interface AuthSysUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(AuthSysUser record);

    AuthSysUser selectByPrimaryKey(Integer userId);

    List<AuthSysUser> selectAll();

    int updateByPrimaryKey(AuthSysUser record);

    AuthSysUser getUserByUserName(String username);
}