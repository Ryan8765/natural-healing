package com.reviews.healing.natural.dao;

import java.util.List;

import com.reviews.healing.natural.entity.Condition;
import com.reviews.healing.natural.util.ConditionsOrderByUtil;


public interface ConditionDAO {
	
	//save a condition to the database
	public void saveCondition(Condition theCondition);
	
	//return a list of all conditions
	public List<Condition> listAllConditions( ConditionsOrderByUtil OrderBy );
	
}
