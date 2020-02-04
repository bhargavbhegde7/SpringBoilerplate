package com.bhegde.tryapp.ctrlrs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bhegde.tryapp.domain.User;
import com.bhegde.tryapp.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }
	
	@PostMapping("/user")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
	
	@GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id")Integer id) {
        return userService.getUserById(id);
    }
}
