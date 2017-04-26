package com.chy.swagger.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chy.swagger.entity.User;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@ApiOperation(value = "获取用户列表", notes = "返回所有用户")
	@RequestMapping(method = RequestMethod.GET)
	public List<User> getUsers(){
		User user = new User("1", "tom", "1234", 1, true);
		User u = new User("2", "jack", "1234", 2, false);
		List<User> users = new ArrayList<>();
		users.add(user);
		users.add(u);
		return users;
	}
	
	@ApiOperation(value = "更新用户", notes = "返回更新后用户")
	@ApiImplicitParam(name = "user", value = "用户", required = true, dataType = "User")
	@RequestMapping(method = RequestMethod.POST)
	public User updateUser(User user){
		return user;
	}

}
