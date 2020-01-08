package com.health.service;


import com.health.entity.SysUser;
import com.health.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class SysUserService {
    @Autowired
    SysUserMapper sysUserMapper;


    public SysUser selectById(int id){
        return sysUserMapper.selectByPrimaryKey(id);
    }


}
