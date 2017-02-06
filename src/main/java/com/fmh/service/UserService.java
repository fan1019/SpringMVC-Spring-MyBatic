package com.fmh.service;

import com.fmh.pojo.User;

import java.util.List;

public interface UserService {
	public void add(User user);

	public User find(int id);

	public List<User> getAllUser();

	public void delete(int id);
}
