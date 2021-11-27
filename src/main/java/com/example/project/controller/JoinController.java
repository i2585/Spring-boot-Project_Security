package com.example.project.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.mapper.Usermapper;
import com.example.project.model.User;
import com.example.project.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class JoinController {

	private final Usermapper mapper;
	private final UserRepository userRepository;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;

	@PostMapping("/join")
	public String join(@RequestBody User user) {
		if (mapper.checkId(user) == null) {
			user.setPw(bCryptPasswordEncoder.encode(user.getPw()));
			user.setRoles("ROLE_USER");
			userRepository.save(user);
			return "true";
		} else {
			return "false";
		}
	}
}
