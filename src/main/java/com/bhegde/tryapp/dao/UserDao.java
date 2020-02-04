package com.bhegde.tryapp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bhegde.tryapp.domain.User;

@Service
public interface UserDao {
	List<User> getUsers();
	User createUser(User user);
    Optional<User> findById(int id);
}
