package com.reviews.healing.natural.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.reviews.healing.natural.entity.User;


@Repository
public class UserDAOImpl implements UserDAO {
	
	//need to inject the session factor
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<User> getUsers() {
		
		//get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create a query - remember to use the class name "User" - not the table name "Users"
		Query<User> theQuery = currentSession.createQuery("from User", User.class);
		
		//execute query and get result list
		List<User> users = theQuery.getResultList();
		
		
		//return the results
		return users;
	}
	
	
	@Override
	public User getUser( int userID ) {
		//get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create the query - use placeholders for sql injection projection.
		Query theQuery = currentSession.createQuery("from User where id = :userID");
		theQuery.setParameter("userID", userID);
		
		User theUser = (User) theQuery.getSingleResult();
		
		return theUser;
	}
	

}
