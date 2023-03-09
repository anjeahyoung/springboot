package com.my.spring.web.ch05.ex02.dao;

import java.util.List;

import com.my.spring.web.ch05.domain.User;

public interface UserDao {
	List<User> selectUsers();
	void insertUser(User user);
	void updateUser(User user);
	void deleteUser(int userId);
}
