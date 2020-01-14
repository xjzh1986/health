package com.health.controller;


import com.health.entity.SysUser;
import com.health.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/index")
@Api(tags = "用户操作模块")
public class IndexController {
    @Autowired
    SysUserService sysUserService;

//    @SysLogAnnotation("登录")
    @ApiOperation(value = "登录" ,  notes="登录")
    @RequestMapping(value="/doLogin",method= RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('USER')")
    public SysUser doLogin(@RequestBody SysUser sysUser){
        SysUser sysUserResult = sysUserService.selectById(1);
        return sysUserResult;
    }
//    @SysLogAnnotation("登出")
    @ApiOperation(value = "登出" ,  notes="登出")
    @RequestMapping(value="/removeLogin",method= RequestMethod.POST)
    @ResponseBody
    public String removeLogin(@RequestBody SysUser sysUser){
        System.out.println("登出");
        SysUser sysUserResult = sysUserService.selectById(1);

        return "SUCCESS";
    }
}
