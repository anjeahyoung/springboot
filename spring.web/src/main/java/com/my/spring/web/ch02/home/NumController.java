package com.my.spring.web.ch02.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02/home")
@RequestMapping("ch02/home")
public class NumController {
	/*
	@GetMapping("numin")
	public String numin() {
		return "ch02/home/numin";
	}
	
	@PostMapping("numin")
	public String numin(int number, Model model) {
		double num = (int)(Math.random() * 10) / 10.0 + number;
		model.addAttribute("num", num);
		return "ch02/home/numout";
	}
	*/
	//정답
	@GetMapping("numin")
	public String numIn() {
		return "ch02/home/numin";
	}
	
	@GetMapping("numout")
	public String numOut(Number num) {
		return "ch02/home/numout";
	}
}
/*
	과제: 폼에 자연수 하나를 입력한다.
	폼을 제출한다.
	입력값이 <= x < 입력값 + 1인, x 를 출력한다.
	x는 실수이다.
	x는 랜덤값이다.
	x는 소수점 이하 한자리까지 표현한다.
	
*/