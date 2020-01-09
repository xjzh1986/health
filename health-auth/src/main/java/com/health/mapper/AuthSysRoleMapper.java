package com.health.mapper;

import com.health.entity.AuthSysRole;

import java.util.List;

public interface AuthSysRoleMapper {

    int deleteByPrimaryKey(Integer roleId);

    int insert(AuthSysRole record);

    AuthSysRole selectByPrimaryKey(Integer roleId);

    List<AuthSysRole> selectAll();

    int updateByPrimaryKey(AuthSysRole record);

    List<AuthSysRole> getRolesByUserId(Integer userId);
}