package com.health.service;

import com.health.constants.SysConstant;
import com.health.entity.BaseResult;
import com.health.entity.HealthOrder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class IOrderHystrix implements IOrderService{

    @RequestMapping("/order/selectById")
    public BaseResult selectById(HealthOrder healthOrder){
        BaseResult result = new BaseResult(SysConstant.EOORO_505);
        return result;
    }

    @RequestMapping("/order/insert")
    public BaseResult insert(HealthOrder healthOrder){
        BaseResult result = new BaseResult(SysConstant.EOORO_505);
        return result;
    }
}
