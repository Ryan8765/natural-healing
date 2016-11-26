package com.reviews.healing.natural.dao;

import com.reviews.healing.natural.entity.Condition;


public interface ConditionDAO {
	
	//save a condition to the database
	public void saveCondition(Condition theCondition);
	
}
