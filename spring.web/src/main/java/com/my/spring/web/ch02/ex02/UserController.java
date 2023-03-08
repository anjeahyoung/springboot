package com.my.spring.web.ch02.ex02;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02.ex02")
@RequestMapping("ch02/ex02")
public class UserController {
	@GetMapping("userIn")
	public String userIn() {
		return "ch02/ex02/userIn";
	}
	
	/*
	@PostMapping("userOut")
	public String userOut(@RequestParam(기본값이기 때문에 생략가능) String userName,
							@RequestParam int age,
							@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate regDate,
							Model model) {
		model.addAttribute("user", new User(userName, age, regDate));
		return "ch02/ex02/userOut";
	}
	*/
	
	@PostMapping("userOut")// 업무명/기능명
	public String userOut(String userName,
							int age,
							@DateTimeFormat(pattern="yyyy-MM-dd") LocalDate regDate,
							Model model) {
		model.addAttribute("user", new User(userName, age, regDate));
		return "ch02/ex02/userOut";
	}
}
