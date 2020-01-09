package com.health.mapper;

import com.health.entity.HealthOrder;

import java.util.List;

public interface HealthOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HealthOrder record);

    HealthOrder selectByPrimaryKey(Integer id);

    List<HealthOrder> selectAll();

    int updateByPrimaryKey(HealthOrder record);
}