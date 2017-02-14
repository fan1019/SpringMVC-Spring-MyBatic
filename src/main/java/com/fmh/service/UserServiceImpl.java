package com.fmh.service;

import com.fmh.dao.UserMapper;
import com.fmh.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	private final UserMapper userMapper;

	@Autowired
	public UserServiceImpl(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public void add(User user) {
		userMapper.add(user);
	}

	@Override
	public User find(int id) {
		return userMapper.find(id);
	}

	@Override
	public List<User> getAllUser() {
		return userMapper.getAllUser();
	}

	@Override
	public void delete(int id) {
		userMapper.delete(id);
	}
}
