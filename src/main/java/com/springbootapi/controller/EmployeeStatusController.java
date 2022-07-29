package com.springbootapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springbootapi.model.EmployeeStatus;
import com.springbootapi.repository.EmployeeStatusRepository;

@Controller
public class EmployeeStatusController {
	
	@Autowired
	private EmployeeStatusRepository esr;
	
	@RequestMapping(value="/")
	public String home() {
		System.out.println("inside home get request mapping");
        return "home.html";
	}

    @RequestMapping(value="/addStatus")
    public String addStatusInfo() {
        System.out.println("inside add status info request mapping");
        return "addStatus.html";
    }
    
    @RequestMapping(value="/addStatus", method=RequestMethod.POST)
    @ResponseBody
    public String addStatus(String empid,String dept) {
    	System.out.println("inside add status post request mapping");
    	esr.saveStatus(empid,dept);
    	
    	return "Data saved successfully in the database!";
    }
    
    @RequestMapping(value="/getStatus")
    public String getStatusInfo() {
    	System.out.println("inside get status info request mapping");
    	return "getStatus.html";
    }
    
    @RequestMapping(value="/getStatus", method=RequestMethod.POST)
    @ResponseBody
    public EmployeeStatus getStatus(String empid) {
    	System.out.println("inside get status post request mapping");
    	return esr.getEmployeeStatus(empid);
    }
}

