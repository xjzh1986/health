package com.health.mapper;

import com.health.entity.AuthUserRoleRef;

import java.util.List;

public interface AuthUserRoleRefMapper {
    int deleteByPrimaryKey(Integer userRoleId);

    int insert(AuthUserRoleRef record);

    AuthUserRoleRef selectByPrimaryKey(Integer userRoleId);

    List<AuthUserRoleRef> selectAll();

    int updateByPrimaryKey(AuthUserRoleRef record);
}