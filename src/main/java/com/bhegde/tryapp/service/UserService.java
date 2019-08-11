package com.bhegde.tryapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bhegde.tryapp.domain.User;

@Service
public interface UserService {
	public List<User> getUsers();
	public User addUser(User user);
	public User getUserById(int id);
}
