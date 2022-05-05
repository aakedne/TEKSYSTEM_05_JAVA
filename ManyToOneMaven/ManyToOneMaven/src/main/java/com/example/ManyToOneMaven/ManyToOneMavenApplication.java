package com.example.ManyToOneMaven;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import Entity.DepartmentEntity;
import Entity.TeacherEntity;

public class ManyToOneMavenApplication {

	public static void main(String[] args) {
		SessionFactory factory = new 
				Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction t =session.beginTransaction();
		
//		DepartmentEntity it_dept = new DepartmentEntity();
//		it_dept.setDeptName("IT");
//		
//		DepartmentEntity hr_dept = new DepartmentEntity();
//		hr_dept.setDeptName("HR");
		
		TeacherEntity t5 =new TeacherEntity();
		t5.setTeacherName("Dave");
		t5.setSalary("70k");
//		t5.setDepartment(it_dept);
		
		TeacherEntity t6 =new TeacherEntity();
		t6.setTeacherName("Sara");
		t6.setSalary("45k");
//		t6.setDepartment(hr_dept);
		
		TeacherEntity t7 =new TeacherEntity();
		t7.setTeacherName("Bob");
		t7.setSalary("95k");
//		t7.setDepartment(it_dept);
		
		TeacherEntity t8 =new TeacherEntity();
		t8.setTeacherName("Joe");
		t8.setSalary("65k");

		
		
	List<TeacherEntity> teacherList = new ArrayList<>();
	teacherList.add(t5);
	teacherList.add(t6);
	teacherList.add(t7);
	teacherList.add(t8);
		session.save(t5);
		session.save(t6);
		session.save(t7);
		session.save(t8);
		
		//      Create the departments
		DepartmentEntity dept = new DepartmentEntity();
		dept.setDeptName("Development");
		dept.setTeacherList(teacherList);
		
		session.save(dept);
		
		t.commit();
		session.close();
		
	}

}
