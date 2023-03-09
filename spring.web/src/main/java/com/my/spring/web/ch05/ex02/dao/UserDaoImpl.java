package com.my.spring.web.ch05.ex02.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.spring.web.ch05.domain.User;
import com.my.spring.web.ch05.ex02.dao.map.UserMap;

@Repository("ch05.ex02.userDao")
public class UserDaoImpl implements UserDao{
	@Autowired private UserMap userMap;
	
	@Override
	public List<User> selectUsers() {
		return userMap.selectUsers();
	}
	@Override
	public void insertUser(User user) {
		userMap.insertUser(user);
	}
	
	@Override
	public void updateUser(User user) {
		userMap.updateUser(user);
	}
	
	
	@Override
	public void deleteUser(int userId) {
		userMap.deleteUser(userId);
	}
}
