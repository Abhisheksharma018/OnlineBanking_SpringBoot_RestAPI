package com.online.banking.userfront.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController 
{
	@RequestMapping("/hello")
	public String hello() {
		return "Hello" ;
	}
	
	
}
