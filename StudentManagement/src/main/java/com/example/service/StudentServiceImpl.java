package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.StudentBean;
import com.example.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDao dao;

	@Override
	public List<StudentBean> getStudent() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public StudentBean addStudent(StudentBean stu) {
		// TODO Auto-generated method stub
		return dao.save(stu);
	}

	@Override
	public StudentBean updateStudent(StudentBean upd) {
		// TODO Auto-generated method stub
		return dao.save(upd);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		
	}

	@Override
	public void deleteAllStudent() {
		// TODO Auto-generated method stub
		dao.deleteAll();
	}

}
