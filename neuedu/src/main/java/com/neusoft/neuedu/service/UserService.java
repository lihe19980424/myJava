package com.neusoft.neuedu.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.github.pagehelper.PageInfo;
import com.neusoft.neuedu.common.HigherResponse;
import com.neusoft.neuedu.entity.User;

public interface UserService {

	HigherResponse<User> login(String username,String psw,HttpServletRequest req);
	
	HigherResponse<PageInfo<User>> queryUserByPage(Integer pageNum,Integer pageSize,HttpServletRequest req);
	
	HigherResponse<User> getLoginUserInfo(HttpSession session);
	
	// 根据id查询用户信息
	HigherResponse<User> getUserInfoByUserId(HttpSession session,Integer id);
	
	// 根据id修改用户信息
	HigherResponse<String> updateUserInfoById(HttpSession session,User user);
}