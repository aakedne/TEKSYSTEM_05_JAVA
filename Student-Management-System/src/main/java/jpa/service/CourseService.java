package jpa.service;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class CourseService  implements CourseDAO {
    public CourseService() {

    }

    @Override
    public List<Course> getAllCourses() {

            EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SMS");
            EntityManager entityManager =emfactory.createEntityManager();

             

        List<Course> courses = (List<Course>) entityManager.createQuery("SELECT c FROM Course c").getResultList();




        entityManager.close();
        emfactory.close();

                return courses;

    }


}