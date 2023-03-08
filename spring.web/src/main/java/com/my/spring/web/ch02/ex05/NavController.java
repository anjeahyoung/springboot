package com.my.spring.web.ch02.ex05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ch02/ex05")
public class NavController {
	@GetMapping("forward")
	public String forward() {
		return "forward:target";
	}//forward를 쓰면 url로 변한다.
	
	@GetMapping("target")
	public String target() {
		return "ch02/ex05/target";
	}
	
	@GetMapping("redirect")
	public String redirect() {
		return "redirect:target";
	}
	
	@GetMapping("naver")
	public String naver() {
		return "redirect:https://naver.com";
	}
}
/*
 핸들러간의 이동이 주제
 forward는 request를 보낸다. 따라서 같은 서버내의 이동이다.
 redirect는 response를 보낸다. 따라서 다른 서버도 이동이 가능하다.
*/