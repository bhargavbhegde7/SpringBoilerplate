package com.bhegde.tryapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bhegde.tryapp.dao.UserDao;
import com.bhegde.tryapp.domain.User;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public List<User> getUsers() {
		return userDao.getUsers();
	}

	@Override
	public User addUser(User user) {
		return userDao.createUser(user);
	}

	@Override
	public Optional<User> getUserById(int id) {
		return userDao.findById(id);
	}

}
