package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Student")
public class StudentBean {
	@Id
	private int id;
	@Size(min = 4, message = "Length between 4-8 characters")
	private String name;
	@Size(min = 1, message = "Length between 1-6 characters")
	private String address;
	
	

}
