package com.health.controller;


import com.health.entity.HealthOrder;
import com.health.service.HealthOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/index")
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
    public String removeLogin(@RequestBody HealthOrder healthOrder){
        System.out.println("removeLogin");
        return "SUCCESS";
    }
}
