package com.my.spring.web.ch02.ex01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //자동으로 겟터 셋터 생성
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private String userName;
	private int age;
}
