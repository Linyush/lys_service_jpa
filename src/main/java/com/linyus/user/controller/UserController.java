package com.linyus.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linyus.user.service.UserService;

/**
 * create by eason on 2018年5月16日
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
}
