//package jpa.mainrunner;
//
//import jpa.dao.StudentDAO;
//import jpa.entitymodels.Course;
//import jpa.entitymodels.Student;
//
//import javax.persistence.*;
//import java.util.List;
//
//public class studentService implements StudentDAO {
//	private EntityManagerFactory emfactory;
//	private EntityManager entityManager;
//
//	public studentService() {
//
//		emfactory = Persistence.createEntityManagerFactory("SMS");
//		entityManager = emfactory.createEntityManager();
//
//	}
//
//	@Override
//	public List<Student> getAllStudents() {
//
//		TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s", Student.class);
//
//		List<Student> studentList = query.getResultList();
//
//		return studentList;
//
//	}
//
//	@Override
//	public Student getStudentByEmail(String sEmail) {
//
//		Student foundStudent = entityManager.find(Student.class, sEmail);
//		if (foundStudent == null) {
//			throw new EntityNotFoundException("Can't find Student Registration for :" + sEmail);
//		}
//
//		return foundStudent;
//
//	}
//
//	@Override
//	public boolean validateStudent(String sEmail, String sPassword) {
//
//		Student foundStudent = entityManager.find(Student.class, sEmail);
//		if (foundStudent == null) {
//
//			System.out.println("Cannot find Student Registration for : " + sEmail);
//
//			return false;
//
//		} else if (!foundStudent.getsPass().equals(sPassword)) {
//			System.out.println("Incorrect Password.");
//			return false;
//		} else {
//
//			return true;
//		}
//
//	}
//
//	@Override
//	public void registerStudentToCourse(String sEmail, int cId) {
//
//		entityManager.getTransaction().begin();
//		Course cou = entityManager.find(Course.class, cId);
//
//		Student student = getStudentByEmail(sEmail);
//		System.out.println();
//		System.out.println("Course=" + cou.getcName());
//		System.out.println("Student=" + student.getsName());
//		System.out.println("Checking Current CourseList");
//
//		List<Course> allstudentcourses = student.getsCourses();
//
//		allstudentcourses.add(cou);
//		student.setsCourses(allstudentcourses);
//		entityManager.persist(student);
//		entityManager.getTransaction().commit();
//		System.out.println();
//		System.out.println("Printing Updated Course List");
//
//	}
//
//	@Override
//	public List<Course> getStudentCourses(String sEmail) {
//		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SMS");
//		EntityManager entityManager = emfactory.createEntityManager();
//		try {
//
//			String sql = " SELECT sc FROM Student s JOIN s.sCourses sc WHERE s.sEmail = :Email ";
//
//			Query query = entityManager.createQuery(sql);
//			query.setParameter("Email", sEmail);
//
//			List<Course> allMyCourses = query.getResultList();
//
//			entityManager.close();
//			emfactory.close();
//			return allMyCourses;
//		} catch (Exception e) {
//			return null;
//		}
//
//	}
//}
//
