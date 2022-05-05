package com.example.demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction t = session.beginTransaction();
    	StudentEntity student = new StudentEntity("Haseeb", "Muhammad", "mhaseebe@mail.com");
    	StudentEntity student1 = new StudentEntity("John", "Cena", "john@mail.com");
    	StudentEntity student2 = new StudentEntity("Jennifer", "Bai", "jBaji@mail.com");
          
       // save the student objects
         session.save(student);
          session.save(student1);
         
         session.save(student2);
            // commit transaction
            t.commit();
            
         // ------------------ retrieve data from H2 database ----------------------  
            String hql = "SELECT s FROM Student s"; 
      	    Query query = session.createQuery(hql);
      	    List<StudentEntity> list  =  query.getResultList();
      	    
      	    for (StudentEntity stu : list) {
      	    	 System.out.println("Student Id: " +stu.getId() + " | First name: " + stu.getFirstName() +" | LastName: "+ stu.getLastName()  +" | Email: " + stu.getEmail() );

      	    }
        }
    

}


