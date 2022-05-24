package test;

import jpa.entitymodels.Course;
import jpa.service.CourseService;

import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.aspectj.lang.annotation.Before;
import org.assertj.core.api.Assert;


import java.util.List;

public class CourseDAOTest {
	
     CourseService courseService;

   @Before(value = "0") 
    public void before(){
      
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SMS");
        EntityManager entityManager =emfactory.createEntityManager();

        courseService= new CourseService();

    }
   @Test
    public void getAllCoursesTest(){
        List<Course> courses = courseService.getAllCourses();
        Assert.assertEquals(courses.size(),10);


    }
}
