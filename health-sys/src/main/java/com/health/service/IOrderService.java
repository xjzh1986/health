package com.health.service;

import com.health.entity.BaseResult;
import com.health.entity.HealthOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "health-order",fallback = IOrderHystrix.class)
public interface IOrderService {

    @RequestMapping("/order/selectById")
    public BaseResult selectById(HealthOrder healthOrder);

    @RequestMapping("/order/insert")
    public BaseResult insert(HealthOrder healthOrder);
}
