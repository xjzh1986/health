package com.health.controller;


import com.health.entity.SysUser;
import com.health.log.entity.SysLogAnnotation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/index")
@Api(tags = "用户操作模块")
public class IndexController {


    @SysLogAnnotation("登录")
    @ApiOperation(value = "登录" ,  notes="登录")
    @RequestMapping(value="/doLogin",method= RequestMethod.POST)
    @ResponseBody
    public String doLogin(@RequestBody SysUser sysUser){

        return "SUCCESS";
    }
    @SysLogAnnotation("登出")
    @ApiOperation(value = "登出" ,  notes="登出")
    @RequestMapping(value="/removeLogin",method= RequestMethod.POST)
    @ResponseBody
    public String removeLogin(@RequestBody SysUser sysUser){

        return "SUCCESS";
    }
}
