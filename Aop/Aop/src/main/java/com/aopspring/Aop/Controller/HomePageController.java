package com.aopspring.Aop.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
	
	@GetMapping("/login")
	public String loginController() {
		return "Login controller";
		
	}

}
