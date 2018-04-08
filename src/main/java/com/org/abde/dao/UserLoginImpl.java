package com.org.abde.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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


	@Override
	public User findByusernameDao(String username,String password) {
		System.out.println("calling findByusernameDao username"+username+" password->"+password);
		Criteria criteria = getSessionFactory().createCriteria(User.class);
		  criteria.add(Restrictions.eq("username", username));
		  criteria.add(Restrictions.eq("password", password));
		  List<User> userList=criteria.list();
		  System.out.println(userList.size());
		  if(userList.size()>0) {
		  System.out.println("returning list");
		  return (User) criteria.list().get(0);
		  }
		  return null;
		  
		
	}
}
