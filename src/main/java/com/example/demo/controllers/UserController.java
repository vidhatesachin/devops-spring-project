package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;
import com.example.demo.vo.UserVO;


@RestController
public class UserController {
	private final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@GetMapping("users")
	public ResponseEntity<List<UserVO>> getUsers() {
		logger.info("getUsers() ..... start");
		List<UserVO> users = this.userService.getUsers();
		logger.info("getUsers() ..... end");
		return ResponseEntity.ok().contentType(MediaType.parseMediaType("application/json"))
				.body(users);
	}
	
	@GetMapping("user/{id}")
	public ResponseEntity<UserVO> getUser(@PathVariable("id") Integer id) {
		logger.info("getUser() ..... start");
		logger.info("Details requested for id:{}",id);
		UserVO user = this.userService.getUser(id);
		logger.info("getUser() ..... end");
		return ResponseEntity.ok().contentType(MediaType.parseMediaType("application/json"))
				.body(user);
	}

}
