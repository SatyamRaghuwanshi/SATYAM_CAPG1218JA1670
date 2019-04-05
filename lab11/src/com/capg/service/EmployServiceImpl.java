 package com.capg.service;

import java.util.List;

import com.capg.bean.Employ;
import com.capg.dao.EmployDao;
import com.capg.dao.EmployDaoImpl;

public class EmployServiceImpl implements EmployService {

	EmployDao edao=new EmployDaoImpl();
	public EmployServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String addEmployee(Employ e) {
		if(e==null||e.getName().length()<4||e.getAge()<18)
		{
			return "Invalid Data";
		}
		else {
			return edao.addEmployee(e);
		}
		
	}

	@Override
	public String deleteEmployee(String empid) {
		if(empid==null||empid.length()<4)
		{
		return "Invalid Employee id";	
		}
		else
		{
		return edao.deleteEmployee(empid);
	}
	}

	@Override
	public Employ searchEmployee(String empid) {
		if(empid==null||empid.length()>4)
		{
		return null;	
		}
		else
		{
		return edao.searchEmployee(empid);
	}
	}
	
	//	public List<Employ> allEmploy(){
		//	return null;
			
	//	}

		@Override
		public List<Employ> allEmployee() {
			// TODO Auto-generated method stub
			return edao.allEmploy();
		}

}


