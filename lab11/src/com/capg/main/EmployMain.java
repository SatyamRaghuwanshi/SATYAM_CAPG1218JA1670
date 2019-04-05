package com.capg.main;

import com.capg.bean.Employ;
import com.capg.service.EmployService;
import com.capg.service.EmployServiceImpl;

public class EmployMain {

	public static void main(String args[]) {
		
		EmployService eservice=new EmployServiceImpl();
		Employ emp=new Employ("A1001","Satyam",222,235480);
		Employ emp1=new Employ("A1002","Singh",2,104700);
		Employ emp2=new Employ("A1003","Raghuwanshi",322,89480);
		eservice.addEmployee(emp);
		eservice.addEmployee(emp1);
		eservice.addEmployee(emp2);
		
		System.out.println(eservice.allEmployee());
		
	}
}
