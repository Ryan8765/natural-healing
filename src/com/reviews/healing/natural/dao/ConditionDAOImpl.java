package com.reviews.healing.natural.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reviews.healing.natural.entity.Condition;
import com.reviews.healing.natural.entity.User;
import com.reviews.healing.natural.util.ConditionsOrderByUtil;

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

	@Override
	public List<Condition> listAllConditions(ConditionsOrderByUtil OrderBy) {
		//get current session hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create the query
		Query<Condition> theQuery;
		
		//this uses the class ConditionsOrderByUtil to determine how the order of the conditions should show up.
		switch (OrderBy) {
			case ALPHABETICAL:
				theQuery = currentSession.createQuery("FROM Condition c ORDER BY c.name ASC", Condition.class);
				break;
			default:
				theQuery = currentSession.createQuery("FROM Condition c ORDER BY c.name ASC", Condition.class);
				break;
		}
		
		List<Condition> conditions = theQuery.getResultList();
		
		//execute the query
		return conditions;
	}

}
