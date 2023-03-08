package com.my.spring.web.ch02.ex01;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ComponentScan("com.my.spring.web.ch02.ex01")
public class UserController {
	@GetMapping("11")
	public ModelAndView handler11(ModelAndView mv) {
		mv.addObject("user", new User("최한석", 11));
		mv.setViewName("ch02/ex01/user");
		
		return mv;
	}
	
	@GetMapping("21")
	public String handler21(Model model) {
		model.addAttribute("user", new User("한아름", 27));
		return "ch02/ex01/user";
	} // return 값은 string 이지만 model 도 같이 보낸다.
	
	@GetMapping("22")
	public String handler22() {
		return "ch02/ex01/user";
	}
	
	@GetMapping("ch02/ex01/31") //viewName : String 타입 31 model : User
	public void handler31(User user) {
		user.setUserName("양승일");
		user.setAge(35);
	}
	
	@GetMapping("ch02/ex01/32")
	public void handler32(@ModelAttribute("man") User user) {
		user.setUserName("서준한");
		user.setAge(32);
	}
	
	@GetMapping("ch02/ex01/41")
	public User handler41(User user) {
		user.setUserName("김가람");
		user.setAge(24);
		
		return user;
	}
	
	@GetMapping("ch02/ex01/42")
	@ModelAttribute("man")
	public User handler42(User user) {
		user.setUserName("박건우");
		user.setAge(41);
		
		return user;
	}
}
