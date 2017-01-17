package com.fmh.dao;

import com.fmh.pojo.User;

public interface UserMapper {
	public void add(User user);

	public User find(int id);
}
