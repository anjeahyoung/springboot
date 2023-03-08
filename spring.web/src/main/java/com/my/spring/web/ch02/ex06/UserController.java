package com.my.spring.web.ch02.ex06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller("ch02.ex06")
@RequestMapping("ch02/ex06")
public class UserController {
	@GetMapping("login")
	public String loginIn(@ModelAttribute("user") UserDto user) {
		return "ch02/ex06/login";
	}
	
	@PostMapping("login")
	public String login(@ModelAttribute("user") UserDto user, String rememberMe,
			HttpSession session, HttpServletResponse response) {
		session.setAttribute("userName", user.getUserName());
		
		if(rememberMe != null && rememberMe.equals("on")) {
			Cookie cookie = new Cookie("userName", user.getUserName());
			cookie.setMaxAge(10);
			response.addCookie(cookie);
		}
		
		return "ch02/ex06/logout";
	}
}
