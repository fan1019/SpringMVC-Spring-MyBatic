package com.fmh.service;

import com.fmh.pojo.User;

import java.util.List;

public interface UserService {
	void add(User user);

	User find(int id);

	List<User> getAllUser();

	void delete(int id);
}
