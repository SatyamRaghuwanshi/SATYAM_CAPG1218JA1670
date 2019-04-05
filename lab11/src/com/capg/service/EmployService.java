package com.capg.service;

import java.util.List;

import com.capg.bean.Employ;

public interface EmployService {

public String addEmployee(Employ e);
	
	public String deleteEmployee(String empid);
		
	public Employ searchEmployee(String empid);

	public List<Employ>  allEmployee();
	
}
