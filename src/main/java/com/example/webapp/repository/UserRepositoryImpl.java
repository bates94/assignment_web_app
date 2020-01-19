package com.example.webapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.webapp.model.User;

@Repository
public class UserRepositoryImpl implements UserRepository{

	@Autowired
	private EntityManager entityManager;

	@Override
	public User getUser(User user) {
		String query = "from User"
						+ " where user_name = '" + user.getUserName()
						+"' and password = '"+user.getPassword()+"'";
		List<User> userList = entityManager.createQuery(query,User.class).getResultList();
		user = userList.get(0);
		return user;
	}

	@Override
	public void addNewUser(User user) {
		entityManager.persist(user);
	}

	@Override
	public List<User> getUsersList() {
		// TODO Auto-generated method stub
		String query = "from User";
		List<User> userList = entityManager.createQuery(query,User.class).getResultList();
		return userList;
	}
	


}
