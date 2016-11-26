package com.reviews.healing.natural.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reviews.healing.natural.entity.Condition;
import com.reviews.healing.natural.entity.User;

@Repository
public class ConditionDAOImpl implements ConditionDAO {
	
	
	//need to inject the session factor
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveCondition(Condition theCondition) {
		
		
		//get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the condition to the database
		currentSession.save( theCondition );

	}

}
