package com.org.abde.service;

import java.util.List;

import com.org.abde.beans.User;

public interface LoginService {
	List<User> listAllUser();
	long saveOrUpdate(User user);
	User findUserByID(int id);
	void deleteUser(long id);
}
