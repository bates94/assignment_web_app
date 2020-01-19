package com.example.webapp.repository;

import java.util.List;

import com.example.webapp.model.User;

public interface UserRepository {
	
	public User getUser(User user);
	public void addNewUser(User user);
	public List<User> getUsersList();

}
