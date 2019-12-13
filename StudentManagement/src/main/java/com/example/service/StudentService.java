package com.example.service;

import com.example.bean.StudentBean;

public interface StudentService{
	public java.util.List<StudentBean> getStudent();
	public StudentBean addStudent(StudentBean stu);
	public StudentBean updateStudent(StudentBean upd);
	public void deleteStudent(int id);
	public void deleteAllStudent();
	
	

}
