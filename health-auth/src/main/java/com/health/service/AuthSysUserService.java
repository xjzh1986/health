package com.health.service;


import com.health.entity.AuthSysUser;
import com.health.mapper.AuthSysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class AuthSysUserService {
    @Autowired
    AuthSysUserMapper authSysUserMapper;


    public AuthSysUser selectById(int id){
        return authSysUserMapper.selectByPrimaryKey(id);
    }
    public AuthSysUser getUserByUserName(String username){
        return authSysUserMapper.getUserByUserName(username);
    }


}
