package com.example.project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.dao.User;
import com.example.project.service.JoinService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class JoinController {

	private JoinService joinService;

	public JoinController(JoinService joinService) {
		this.joinService = joinService;
	}

	@PostMapping("/join")
	public boolean insertUserProfile(@RequestBody User user) {
			return joinService.join(user);
	}
}
