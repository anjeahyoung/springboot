package com.my.spring.web.ch03.ex02;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletRequest;

@Controller("ch03/ex02")
@RequestMapping("ch03/ex02/user")
public class UserController {
	@Value("${attachPath}") private String attachPath;
	
	@GetMapping
	public String userIn() {
		return "ch03/ex02/userIn";
	}
	
	@PostMapping
	public String userOut(UserDto userDto, User user) {
		String fileName = userDto.getFace().getOriginalFilename();
		saveFile(attachPath + "/" + fileName, userDto.getFace());
		
		user.setFaceFileName(fileName);
		
		return "ch03/ex02/userOut";
	}
	
	public void saveFile(String fileName, MultipartFile file) {
		try {
			file.transferTo(new File(fileName));
		} catch(IOException e) {}
	}
}
