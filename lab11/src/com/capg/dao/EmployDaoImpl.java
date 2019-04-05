package com.capg.dao;
import java.util.List;
import java.util.ArrayList;
import com.capg.bean.Employ;
//import com.capg.dao.EmployDao;

public class EmployDaoImpl implements EmployDao {

	List<Employ> l1=new ArrayList<Employ>();
	
	@Override
	public String addEmployee(Employ e) {
		l1.add(e);
		return "Employee Added";
	}

	@Override
	public String deleteEmployee(String empid) {
		for(Employ e:l1) {
			if(e.getEmpid().equals(empid))
			{
				l1.remove(e);
			}
		}
		
		return "Employee Deleted";
	}

	@Override
	public Employ searchEmployee(String empid) {
		Employ emp=null;
		for(Employ e:l1) {
			if(e.getEmpid().equals(empid))
			{
				emp=e;
			}
		}
		return emp;
	}

	@Override
	public List<Employ> allEmploy() {
		// TODO Auto-generated method stub
		return l1;
	}

	
	


}
