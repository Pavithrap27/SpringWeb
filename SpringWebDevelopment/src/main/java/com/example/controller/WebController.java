package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api")
public class WebController {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello()
	{
		System.out.println("welcome");
		return "welcome";
		
	}

}
