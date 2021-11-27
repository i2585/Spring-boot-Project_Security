package com.example.project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.mapper.Usermapper;
import com.example.project.model.User;

@RestController
@RequestMapping("/find")
public class FindController {
	private Usermapper mapper;
	
	public FindController(Usermapper mapper) {
		this.mapper = mapper;
	}
	
	@PostMapping("id")
	public String FindUserId(@RequestBody User user) {
		if(mapper.FindId(user)!=null) {
			user.setUserid(mapper.FindId(user));
			return user.getUserid();
		}
		else {
			return "false";
		}
	}
	
	@PostMapping("pw")
	public void FindUserPw(@RequestBody User user) {
		mapper.FindPw(user);	
	}
	
}


