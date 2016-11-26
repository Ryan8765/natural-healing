package com.reviews.healing.natural.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.reviews.healing.natural.dao.ConditionDAO;
import com.reviews.healing.natural.entity.Condition;

public class ConditionServiceImpl implements ConditionService {
	
	@Autowired
	private ConditionDAO conditionDAO;

	@Override
	@Transactional
	public void saveCondition(Condition theCondition) {
		
		conditionDAO.saveCondition( theCondition );
		
	}

}
