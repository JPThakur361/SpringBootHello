package com.jaggu.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloworldController {
	 
	@RequestMapping(value="/")
	public String hello(){
		return "Hello World _ Jaggu_Thakur!!";
	}

}
