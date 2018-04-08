package com.org.abde.dao;

import java.util.List;

import com.org.abde.beans.User;


public interface UserLoginDao {
	long saveOrUpdate(User user);

	User findUserByID(int id);

	List<User> listAllUser();

	void deleteUser(long id);

	User findByusernameDao(String username, String password);
}
