package com.example.demonew.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {

	
	@RequestMapping("/")
	public String homes()
	{
		return " hello sanket";
	}
}

