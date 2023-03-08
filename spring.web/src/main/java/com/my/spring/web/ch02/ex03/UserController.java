package com.my.spring.web.ch02.ex03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller("ch02.ex03")
@RequestMapping("ch02/ex03/user")
public class UserController {
	@GetMapping
	public String userIn() {
		return "ch02/ex03/userIn";
	}
	
	@PostMapping //command : 파라미터에 도메인을 넣어서 만든 핸들러
	public String userOut(User user) {
		return "ch02/ex03/userOut";
	}
}