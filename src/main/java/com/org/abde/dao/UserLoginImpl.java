package com.org.abde.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.abde.beans.User;




@Repository
public class UserLoginImpl implements UserLoginDao{
	
	 @Autowired
	 private SessionFactory sessionFactory;
	 
	
	private Session getSessionFactory(){
		return sessionFactory.getCurrentSession();
		 
	 }
	 
	
	@Override
	public long saveOrUpdate(User user) {
		getSessionFactory().saveOrUpdate(user);
		return 0;
	}

	@Override
	public User findUserByID(int id) {
		User user=(User) getSessionFactory().get(User.class,id);
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> listAllUser() {
		System.out.println("calling listAll in dao");
		
		Criteria  citeria =getSessionFactory().createCriteria(User.class);		
		return (List<User>)citeria.list();
	}

	@Override
	public void deleteUser(long id) {
		User user=(User) getSessionFactory().get(User.class,id);	
		getSessionFactory().delete(user);
	}
}
