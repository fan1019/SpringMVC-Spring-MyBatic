package com.fmh.service;

import com.fmh.pojo.User;

public interface UserService {
	public void add(User user);

	public User find(int id);
}
