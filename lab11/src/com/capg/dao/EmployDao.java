package com.capg.dao;

import java.util.List;

import com.capg.bean.Employ;

public interface EmployDao {
	
	public String addEmployee(Employ e);
	
	public String deleteEmployee(String empid);
		
	public Employ searchEmployee(String empid);	
	
	public List<Employ> allEmploy();
	

}
