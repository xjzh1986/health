package com.health.controller;

import com.health.entity.SysUser;
import com.health.entity.UserEntity;
import com.health.service.SysUserService;
import com.health.utils.JwtTokenUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	SysUserService sysUserService;


	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public UserEntity login(@RequestBody JSONObject user) {
		UserEntity userEntity = new UserEntity();
		try {
			String username = user.getString("username");
			String password = user.getString("password");
			Authentication authentication = authenticationManager
					.authenticate(new UsernamePasswordAuthenticationToken(username, password));
			SecurityContextHolder.getContext().setAuthentication(authentication);
			String token = JwtTokenUtil.generateToken(username);
			SysUser sysUser = sysUserService.getUserByUserName(username);
			userEntity.setId(sysUser.getUserId());
			userEntity.setStatus(0);
			userEntity.setUsername(username);
			userEntity.setToken(token);
			List<String> roles = new ArrayList<String>();
			for (GrantedAuthority author : authentication.getAuthorities()) {
				roles.add(author.getAuthority());
			}
			userEntity.setRoles(roles);
		} catch (Exception e) {
			e.printStackTrace();
			userEntity.setStatus(1);
			userEntity.setMsg(e.getMessage());
		}
		return userEntity;
	}


	@RequestMapping(value = "/refreshToken", method = RequestMethod.POST)
	@ResponseBody
	public String refreshToken(@RequestBody JSONObject tokenO) {
		String token = tokenO.getString("token");
		return JwtTokenUtil.refreshToken(token);
	}
}