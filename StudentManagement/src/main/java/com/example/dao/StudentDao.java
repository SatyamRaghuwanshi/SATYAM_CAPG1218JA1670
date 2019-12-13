package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.StudentBean;
//when we extends the JpaRepository ,Spring data jpa will automatically generate the implementation of crud operation
@Repository
public interface StudentDao extends JpaRepository<StudentBean, Integer> {

}
