package com.example.webapp.repository.test;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import javax.persistence.EntityManager;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.webapp.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
class UserRepositoryTest {
	
	@Autowired
	private EntityManager entityManager;
	private String query;
	private User user;
	
	@BeforeEach
	void setUp() throws Exception {
		user = new User(0,"Barış", "Ateş", "06.11.1994", "BATES", "12345");
		query = "from User"
				+ " where user_name = '" + user.getUserName()
				+"' and password = '"+user.getPassword()+"'";
	}

	@AfterEach
	void tearDown() throws Exception {
		user = null;
		query = null;
	}

	@Test
	void testGetUser() {
		List<User> userList = entityManager.createQuery(query,User.class).getResultList();
		user = userList.get(0);
		assertThat(user.getUserName(),Matchers.equalTo("BATES"));
	}
	
	@Test
	void testAddNewUser() {
		List<User> userList = entityManager.createQuery("from User",User.class).getResultList();
		int userCount = userList.size();
		entityManager.persist(user);
		userList = entityManager.createQuery("from User",User.class).getResultList();
		assertThat(userList.size(),Matchers.equalTo(userCount));
	}

}
