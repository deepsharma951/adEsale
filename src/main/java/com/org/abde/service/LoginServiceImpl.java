package com.org.abde.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.org.abde.beans.User;
import com.org.abde.dao.UserLoginDao;



@Service
@Transactional
public class LoginServiceImpl implements LoginService {
	
	
	private UserLoginDao userLoginDao;
	
	@Autowired
	public void setUserLoginDao(UserLoginDao dao){
		this.userLoginDao=dao;
		
	}
	

	

	@Override
	public List<User> listAllUser() {	
		return this.userLoginDao.listAllUser();
	}

	@Override
	public long saveOrUpdate(User user) {
		// TODO Auto-generated method stub
		return userLoginDao.saveOrUpdate(user);
	}

	@Override
	public User findUserByID(int id) {
		// TODO Auto-generated method stub
		return userLoginDao.findUserByID(id);
	}

	@Override
	public void deleteUser(long id) {
		userLoginDao.deleteUser(id);
		
	}

}
