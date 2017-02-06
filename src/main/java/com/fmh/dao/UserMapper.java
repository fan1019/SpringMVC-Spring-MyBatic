package com.fmh.dao;

import com.fmh.pojo.User;

import java.util.List;

public interface UserMapper {
	public void add(User user);

	public User find(int id);

	public List<User> getAllUser();
}
