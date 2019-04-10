package com.cms.dao;

import org.springframework.stereotype.Repository;

import com.cms.entity.User;
@Repository("userDao")
public class UserDao extends BaseDaoImpl<User>{
	
	
	
	public User findUser(int id){
		User user=this.getHibernateTemplate().get(User.class, id);
		return user;
	}
	
}
