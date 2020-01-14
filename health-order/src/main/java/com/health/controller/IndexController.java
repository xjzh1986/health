package com.health.controller;


import com.health.constants.SysConstant;
import com.health.entity.BaseResult;
import com.health.entity.HealthOrder;
import com.health.service.HealthOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@Api(tags = "用户操作模块")
public class IndexController {
    @Autowired
    HealthOrderService healthOrderService;

    @ApiOperation(value = "登录" ,  notes="登录")
    @RequestMapping(value="/doLogin",method= RequestMethod.POST)
    @ResponseBody
//    @PreAuthorize("hasAuthority('USER')")
    public String doLogin(@RequestBody HealthOrder healthOrder){
        System.out.println("doLogin");
        return "success";
    }
    @ApiOperation(value = "登出" ,  notes="登出")
    @RequestMapping(value="/removeLogin",method= RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('USER')")
    public String removeLogin(@RequestBody HealthOrder healthOrder){
        System.out.println("removeLogin");
        return "SUCCESS";
    }

    @ApiOperation(value = "根据Id查询用户信息" ,  notes="根据Id查询用户信息")
    @RequestMapping(value="/selectById",method= RequestMethod.POST)
    @ResponseBody
    public BaseResult selectById(@RequestBody HealthOrder healthOrder){
        HealthOrder healthOrderResult = healthOrderService.selectById(healthOrder.getId());
        BaseResult result = new BaseResult(SysConstant.SUCCESS,healthOrderResult);
        return result;
    }

    @ApiOperation(value = "查询用户信息" ,  notes="查询用户信息")
    @RequestMapping(value="/insert",method= RequestMethod.POST)
    @ResponseBody
    public BaseResult insert(@RequestBody HealthOrder healthOrder){
        healthOrderService.insert(healthOrder);
        BaseResult result = new BaseResult(SysConstant.SUCCESS);
        return result;
    }
}
