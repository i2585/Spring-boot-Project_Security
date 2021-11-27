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
	
	// ȸ������ ����
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
	
//	// ��й�ȣ ����
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
//	// �ּ� ����
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
//	// �̸��� ����
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
//	// ����ȣ ����
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
