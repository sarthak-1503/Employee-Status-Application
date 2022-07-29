package com.springbootapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Entity
@Document(collection="EmployeeStatus")
public class EmployeeStatus {
	
	@Id
    private String empid;
    private String dept;

    public EmployeeStatus() {
    	
    }
    
    public EmployeeStatus(String empid, String dept) {
		super();
		this.empid = empid;
		this.dept = dept;
	}

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

	@Override
	public String toString() {
		return "EmployeeStatus [empid=" + empid + ", dept=" + dept + "]";
	}
}
