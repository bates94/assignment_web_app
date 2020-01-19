package com.example.webapp.service.test;

import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.Matchers;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.webapp.model.User;
import com.example.webapp.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
class UserServiceTest {
	
	@Autowired
	private UserRepository userRepository;

	@Test
	void testGetUserInformationList() {
		User user = new User();
		user = userRepository.getUser(user);
		assertThat(user.getUserName(),Matchers.is(null));
	}
	
	@Test
	void testAddNewUser()
	{
		List<User> list = userRepository.getUsersList();
		int firstListSize = list.size();
		User user = new User(0,"Barış", "Ateş", "06.11.1994", "BATES", "12345");
		userRepository.addNewUser(user);
		list = userRepository.getUsersList();
		assertThat(list.size(),Matchers.equalTo(firstListSize));
	}

}
