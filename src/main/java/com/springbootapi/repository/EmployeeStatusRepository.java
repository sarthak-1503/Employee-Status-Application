package com.springbootapi.repository;

import com.springbootapi.model.EmployeeStatus;

public interface EmployeeStatusRepository {

	void saveStatus(String empid, String dept);
	EmployeeStatus getEmployeeStatus(String empid);

}
