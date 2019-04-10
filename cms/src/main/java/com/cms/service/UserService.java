package com.cms.service;

import com.cms.entity.User;

public interface UserService {
	void saveUser(User user);
	User findUser(int id);
}
