package com.bhegde.tryapp.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bhegde.tryapp.domain.User;

@Service
public interface UserDao {
	public List<User> getUsers();
	public User createUser(User user);
}
