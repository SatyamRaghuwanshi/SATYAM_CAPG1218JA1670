package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.StudentBean;
import com.example.service.StudentServiceImpl;

@RestController
public class StudentController {
	@Autowired
	StudentServiceImpl ser;
	@GetMapping(value="/allStudent")
	public List<StudentBean> getStudent() {
		// TODO Auto-generated method stub
		return ser.getStudent();
	}
	@PostMapping(value="/addStu")
	public StudentBean addStudent(StudentBean stu) {
		// TODO Auto-generated method stub
		return ser.addStudent(stu);
	}
	@PostMapping(value="/updateStu")
	public StudentBean updateStudent(StudentBean upd) {
		// TODO Auto-generated method stub
		return ser.updateStudent(upd);
	}
	@DeleteMapping(value="/deleteStu")
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		ser.deleteStudent(id);		
	}
	@DeleteMapping(value="/deleteAllStu")
	public void deleteAllStudent() {
		// TODO Auto-generated method stub
		ser.deleteAllStudent();
	}
	
	

}
