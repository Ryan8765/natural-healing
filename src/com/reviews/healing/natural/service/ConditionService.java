package com.reviews.healing.natural.service;

import org.springframework.stereotype.Service;

import com.reviews.healing.natural.entity.Condition;


@Service
public interface ConditionService {
	
	//save a new condition to the database
	public void saveCondition(Condition theCondition);

}
