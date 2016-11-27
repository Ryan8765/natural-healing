package com.reviews.healing.natural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reviews.healing.natural.dao.ConditionDAO;
import com.reviews.healing.natural.entity.Condition;
import com.reviews.healing.natural.util.ConditionsOrderByUtil;

@Service
public class ConditionServiceImpl implements ConditionService {
	
	@Autowired
	private ConditionDAO conditionDAO;

	@Override
	@Transactional
	public void saveCondition(Condition theCondition) {
		
		conditionDAO.saveCondition( theCondition );
		
	}

	@Override
	@Transactional
	public List<Condition> listAllConditions(ConditionsOrderByUtil orderBy) {
		// TODO Auto-generated method stub
		return conditionDAO.listAllConditions( orderBy );
	}
	
	

}
