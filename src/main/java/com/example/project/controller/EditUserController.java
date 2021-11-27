package com.example.project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.dto.UserEdit;
import com.example.project.mapper.Usermapper;

@RestController
@RequestMapping("/edit")
public class EditUserController {

	private Usermapper mapper;
	
	public EditUserController(Usermapper mapper) {
		this.mapper = mapper;
	}
	
	// 회원정보 수정
	@PostMapping("/userprofile")
	public boolean edit(@RequestBody UserEdit userEdit) {
		if(userEdit.getUsername() != null && userEdit.getPhonenumber() != null) {
			mapper.editUser(userEdit);
			return true;
		}
		else {
			return false;
		}
	}
	
//	// 비밀번호 변경
//	@PostMapping("/pw")
//	public boolean editPw(@RequestBody User user){
//		if(user.getPw() != "") {
//			mapper.editPw(user);
//			return true;
//		}
//		else {
//			return false;
//		}
//		
//	}
	
//	
//	// 주소 변경
//	@PostMapping("/address")
//	public boolean editAddress(@RequestBody User user) {
//		if(user.getAddress() != "") {
//			mapper.editAddress(user);
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	
//	// 이메일 변경
//	@PostMapping("/email")
//	public boolean editEmail(@RequestBody User user) {
//		if(user.getEmail() != "") {
//			mapper.editEmail(user);
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	
//	// 폰번호 변경
//	@PostMapping("/name")
//	public boolean editPhonenumber(@RequestBody User user) {
//		if(user.getEmail() != "") {
//			mapper.editPhonenumber(user);
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
}
