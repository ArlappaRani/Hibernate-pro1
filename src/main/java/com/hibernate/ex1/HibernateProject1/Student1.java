package com.hibernate.ex1.HibernateProject1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student1 {
	
	@Id
	int rollNo;
	String name;
	int age;
	
	public Student1() {
		super();
	
	}

	public Student1(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
