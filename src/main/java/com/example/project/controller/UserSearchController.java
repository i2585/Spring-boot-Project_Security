//package com.example.project.controller;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.project.mapper.Usermapper;
//import com.example.project.model.User;
//
//@RestController
//public class UserSearchController {
//	
//	private Usermapper mapper;
//	
//	public UserSearchController(Usermapper mapper) {
//		this.mapper = mapper;
//	}
//	
//	@GetMapping("/search/{id}")
//	public User searchUser(@PathVariable("id") String id) {
//		return mapper.searchUser(id);
//	}
//}