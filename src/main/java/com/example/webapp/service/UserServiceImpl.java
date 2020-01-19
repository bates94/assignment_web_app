package com.example.webapp.service;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.webapp.model.User;
import com.example.webapp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	@Transactional
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.getUser(user);
	}

	@Override
	@Transactional
	public void addNewUser(User user) {
		// TODO Auto-generated method stub
		userRepository.addNewUser(user);
	}

}
