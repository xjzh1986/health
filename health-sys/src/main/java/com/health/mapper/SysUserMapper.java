package com.health.mapper;

import com.health.entity.SysUser;

import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(Integer userId);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);

    SysUser getUserByUserName(String username);
}