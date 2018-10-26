package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.vo.UserVO;


@Service
public class UserService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public List<UserVO> getUsers() {
		logger.info("getUsers() ..... start");
		List<UserVO>  users = new ArrayList<UserVO>();
		users.add(new UserVO(1,"John Doe","987XXXXXX12"));
		users.add(new UserVO(2,"Jane Doe","941XXXXXX45"));
		logger.info("getUsers() ..... end");
		return users;
	}
	
	public UserVO getUser(Integer id) {
		logger.info("getUser() ..... start");
		UserVO user;
		Integer one = 1, two = 2;
		if(one.equals(id)) {
			user = new UserVO(1,"John Doe","987XXXXXX12");
		} else if (two.equals(id)) {
			user = new UserVO(2,"Jane Doe","941XXXXXX45");
		} else {
			throw new ResourceNotFoundException("User not found");
		}
		logger.info("getUser() ..... end");
		return user;
	}
	
 
}
