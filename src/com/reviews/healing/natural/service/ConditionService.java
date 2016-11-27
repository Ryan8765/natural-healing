package com.reviews.healing.natural.service;


import java.util.List;

import com.reviews.healing.natural.entity.Condition;
import com.reviews.healing.natural.util.ConditionsOrderByUtil;



public interface ConditionService {
	
	//save a new condition to the database
	public void saveCondition(Condition theCondition);
	
	//list all conditions
	public List<Condition> listAllConditions( ConditionsOrderByUtil orderBy );

}
