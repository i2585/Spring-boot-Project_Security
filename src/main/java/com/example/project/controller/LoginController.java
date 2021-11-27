//package com.example.project.controller;
//
//import com.example.project.model.User;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.project.mapper.Usermapper;
//
//@RestController
//public class LoginController {
//
//	private Usermapper mapper;
//	
//	public LoginController(Usermapper mapper) {
//		this.mapper = mapper;
//	}
//	
//	@PostMapping("/user/login")
//	public boolean loginUser(@RequestBody User user) {
//		return mapper.loginUser(user) != null ? true:false;
//	}
//}
