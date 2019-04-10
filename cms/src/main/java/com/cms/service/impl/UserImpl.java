package com.cms.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cms.dao.UserDao;
import com.cms.entity.User;
import com.cms.service.UserService;

@Service("userService")
@Transactional
public class UserImpl implements UserService{
	
	@Resource(name="userDao")
	private UserDao dao;
	
	@Override
	public void saveUser(User user) {
		dao.save(user);
	}

	@Override
	public User findUser(int id) {
		return dao.findUser(id);
	}

}
