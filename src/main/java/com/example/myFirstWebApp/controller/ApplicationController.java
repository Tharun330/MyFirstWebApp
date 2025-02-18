package com.example.myFirstWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {

	
	
	@RequestMapping(method=RequestMethod.GET , path="sayhello")
	@ResponseBody
	public String satHello() {
		
		return "Say Hello";
	}
	
	@RequestMapping("sayhellojsp")
	public String sayHelloJSP() {
			
		return "sayHello";
	}
}
