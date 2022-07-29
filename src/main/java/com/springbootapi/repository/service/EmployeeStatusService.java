package com.springbootapi.repository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.springbootapi.model.EmployeeStatus;
import com.springbootapi.repository.EmployeeStatusRepository;

@Repository
public class EmployeeStatusService implements EmployeeStatusRepository {

	private final MongoTemplate mongoTemplate;

	@Autowired
	public EmployeeStatusService(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
	@Override
	public void saveStatus(String empid, String dept) {
		mongoTemplate.save(new EmployeeStatus(empid, dept));
	}
	
	@Override
	public EmployeeStatus getEmployeeStatus(String empid) {

		Query query = new Query();
		query.addCriteria(Criteria.where("empid").is(empid));
		return mongoTemplate.findOne(query, EmployeeStatus.class);
	}
}
