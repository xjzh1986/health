package com.health.controller;


import com.health.entity.SysUser;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {



    @ApiOperation(value = "登录" ,  notes="登录")
    @RequestMapping(value="/login/doLogin",method= RequestMethod.POST)
    @ResponseBody
    public String doLogin(@RequestBody SysUser sysUser){

        return "SUCCESS";
    }

    @ApiOperation(value = "登出" ,  notes="登出")
    @RequestMapping(value="/login/removeLogin",method= RequestMethod.POST)
    @ResponseBody
    public String removeLogin(@RequestBody SysUser sysUser){

        return "SUCCESS";
    }
}
