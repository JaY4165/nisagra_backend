package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dto.DtoClass;
import com.example.demo.response.ResponseClass;
import com.example.demo.service.ServiceInterface;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/login")
public class ControllerClass {
	
	@Autowired
	ServiceInterface loginService;
	
	
	@PostMapping("/signin")
	public ResponseClass register(@RequestBody  DtoClass loginDto) {
		 return loginService.login(loginDto);
		 }
	}
