package com.health.service;


import com.health.entity.HealthOrder;
import com.health.mapper.HealthOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class HealthOrderService {
    @Autowired
    HealthOrderMapper healthOrderMapper;


    public HealthOrder selectById(int id){
        return healthOrderMapper.selectByPrimaryKey(id);
    }


}
