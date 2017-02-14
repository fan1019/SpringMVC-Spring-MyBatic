package com.fmh.dao;

import com.fmh.pojo.User;

import java.util.List;

public interface UserMapper {
	void add(User user);

	User find(int id);

	List<User> getAllUser();

	void delete(int id);
}
