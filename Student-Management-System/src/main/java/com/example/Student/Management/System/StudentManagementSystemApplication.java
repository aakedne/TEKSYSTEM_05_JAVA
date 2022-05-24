package com.example.Student.Management.System;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import jpa.entitymodels.Student;





public class StudentManagementSystemApplication {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		
		
//
//		Student s1 = new Student();
//		s1.setsEmail("hluckham0@google.ru");
//		s1.setsName("Hazel Luckham");
//		s1.setsPass("X1uZcoIh0dj");
//
//		Student s2 = new Student();
//		s2.setsEmail("sbowden1@yellowbook.com");
//		s2.setsName("Sonnnie Bowden");
//		s2.setsPass("SJc4aWSU");
//
//		Student s3 = new Student();
//		s3.setsEmail("llorens2@howstuffworks.com");
//		s3.setsName("Quillan Llorens");
//		s3.setsPass("W6rJuxd");
//
//		Student s4 = new Student();
//		s4.setsEmail("cstartin3@flickr.com");
//		s4.setsName("Clem Startin");
//		s4.setsPass("XYHzJ1S");
//
//		Student s5 = new Student();
//		s5.setsEmail("tattwool4@biglobe.ne.jp");
//		s5.setsName("Thornie Attwool");
//		s5.setsPass("Hjt0SoVmuBz");
//
//		Student s6 = new Student();
//		s6.setsEmail("hguerre5@deviantart.com");
//		s6.setsName("Harcourt Guerre");
//		s6.setsPass("OzcxzD1PGs");
//
//		Student s7 = new Student();
//		s7.setsEmail("htaffley6@columbia.edu");
//		s7.setsName("Hazel Luckham");
//		s7.setsPass("X1uZcoIh0dj");
//
//		Student s8 = new Student();
//		s8.setsEmail("aiannitti7@is.gd");
//		s8.setsName("Holmes Taffley");
//		s8.setsPass("X1uZcoIh0dj");
//
//		Student s9 = new Student();
//		s9.setsEmail("ljiroudek8@sitemeter.com");
//		s9.setsName("Laryssa Jiroudek");
//		s9.setsPass("bXRoLUP");
//
//		Student s10 = new Student();
//		s10.setsEmail("cjaulme9@bing.com");
//		s10.setsName("Cahra Jaulme");
//		s10.setsPass("FnVklVgC6r6");
//
//		
//		
//		
//		
//		session.save(s1);
//		session.save(s2);
//		session.save(s3);
//		session.save(s4);
//		session.save(s5);
//		session.save(s6);
//		session.save(s7);
//		session.save(s8);
//		session.save(s9);
//		session.save(s10);
//
//		t.commit();
//		session.close();
		
		
		Course c1 = new Course();
		c1.setcId(1);
		c1.setcName("English");
		c1.setcInstructorName("Anderea Scamaden");

		Course c2 = new Course();
		c2.setcId(2);
		c2.setcName("Mathematics");
		c2.setcInstructorName("Eustace Niemetz");

		Course c3 = new Course();
		c3.setcId(3);
		c3.setcName("Anatomy");
		c3.setcInstructorName("Reynolds Pastor");

		Course c4 = new Course();
		c4.setcId(4);
		c4.setcName("Organic Chemistry");
		c4.setcInstructorName("Odessa Belcher");

		Course c5 = new Course();
		c5.setcId(5);
		c5.setcName("Physics");
		c5.setcInstructorName("Dani Swallow");

		Course c6 = new Course();
		c6.setcId(6);
		c6.setcName("Digital Logic");
		c6.setcInstructorName("Glenden Reilingen");

		Course c7 = new Course();
		c7.setcId(7);
		c7.setcName("Object Oriented Programming");
		c7.setcInstructorName("Giselle Ardy");

		Course c8 = new Course();
		c8.setcId(8);
		c8.setcName("Data Structures");
		c8.setcInstructorName("Carolan Stoller");

		Course c9 = new Course();
		c9.setcId(9);
		c9.setcName("Politics");
		c9.setcInstructorName("Carmita De Maine");

		Course c10 = new Course();
		c10.setcId(10);
		c10.setcName("Art");
		c10.setcInstructorName("Kingsly Doxsey");
		
		
		List<Course> courseList = new ArrayList<>();
		courseList.add(c1);
		courseList.add(c2);
		courseList.add(c3);
		courseList.add(c4);
		courseList.add(c5);
		courseList.add(c6);
		courseList.add(c7);
		courseList.add(c8);
		courseList.add(c9);
		courseList.add(c10);

		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(c4);
		session.save(c5);
		session.save(c6);
		session.save(c7);
		session.save(c8);
		session.save(c9);
		session.save(c10);
		
		
		//create the student
		Student student = new Student();
		student.setsEmail("email");
		student.setsName("Name");
		student.setsPass("password");

		t.commit();
		session.close();
		
	}

}
