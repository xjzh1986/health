package com.health.service;

import com.health.entity.AuthSysRole;
import com.health.entity.AuthSysUser;
import com.health.entity.AuthUserDetails;
import com.health.mapper.AuthSysRoleMapper;
import com.health.mapper.AuthSysUserMapper;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("UserDetailsService")
public class AuthUserDetailsService implements UserDetailsService {

	@Resource
	private AuthSysUserMapper authSysUserMapper;
	@Resource
	private AuthSysRoleMapper authSysRoleMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		// 通过username查询用户
		AuthSysUser user = authSysUserMapper.getUserByUserName(username);
		AuthUserDetails auth = new AuthUserDetails();
		auth.setId(user.getUserId());
		auth.setUsername(user.getUserName());
		auth.setPassword(user.getPassword());
		if (auth == null) {
			// 仍需要细化处理
			throw new UsernameNotFoundException("该用户不存在");
		}
		List<AuthSysRole> roles = authSysRoleMapper.getRolesByUserId(user.getUserId());
		Set authoritiesSet = new HashSet();
		// 模拟从数据库中获取用户角色
		for (AuthSysRole role : roles) {
			authoritiesSet.add(new SimpleGrantedAuthority(role.getRoleName()));
		}
		auth.setAuthorities(authoritiesSet);

		return auth;
	}
}
