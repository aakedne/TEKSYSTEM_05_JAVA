package com.Successacademictutoringsystem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.InstructorEntity;
import entity.SubjectEntity;

public class SuccessAcademicTutoringSystemApplication {

	public static void main(String[] args) {
		SessionFactory factory = new
				Configuration().configure().buildSessionFactory(); // configuration
		Session session = factory.openSession(); // session
		
		Transaction t = session.beginTransaction(); //transaction , create few subjects
		
		// creating subjects
		SubjectEntity  eng_subj = new SubjectEntity();
		eng_subj.setSubjectName("English");
		
		SubjectEntity  it_subj = new SubjectEntity();
		it_subj.setSubjectName("Information Technology");
		
		//create 3 random instructors/teachers
		InstructorEntity inst1 = new InstructorEntity();
		inst1.setInstructorName("Erik");
		inst1.setInstructorSalary("98k");
		inst1.setInstructorSubject("it_subj");
		
		InstructorEntity inst2 = new InstructorEntity();
		inst2.setInstructorName("Kevin");
		inst2.setInstructorSalary("90k");
		inst2.setInstructorSubject("it_subj");
		
		InstructorEntity inst3 = new InstructorEntity();
		inst3.setInstructorName("Omar");
		inst3.setInstructorSalary("70k");
		inst3.setInstructorSubject("eng_subj");
		
		InstructorEntity inst4 = new InstructorEntity();
		inst4.setInstructorName("Joshuar");
		inst4.setInstructorSalary("80k");
		inst4.setInstructorSubject("eng_subj");
		
		session.save(it_subj);
		session.save(eng_subj);
		session.save(inst1);
		session.save(inst2);
		session.save(inst3);
		session.save(inst4);

		t.commit();
		session.close();
		
		
	}

}
