package jpa.mainrunner;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class SMSRunner {
//declare everything
	private Scanner sin;
	private StringBuilder sb;

	private CourseService courseService;
	private StudentService studentService;
	private Student currentStudent;

	public SMSRunner() {
		sin = new Scanner(System.in);
		sb = new StringBuilder();
		courseService = new CourseService();
		studentService = new StudentService();
	}

	public static void main(String[] args) {

		SMSRunner sms = new SMSRunner();
		sms.run();

	}

	private void run() {

		switch (menu1()) {
		case 1:
			if (studentLogin()) {
				registerMenu();
			}
			break;
		case 2:
			System.out.println("Goodbye!");
			break;

		default:

		}
	}

	private int menu1() {
		sb.append("\n1.Student Login\n2. Quit Application\nPlease Enter Selection: ");
		System.out.print(sb.toString());
		sb.delete(0, sb.length());

		return sin.nextInt();
	}

	private boolean studentLogin() {

		boolean retValue = false;
		System.out.print("Enter your email address: ");
		String email = sin.next();
		System.out.print("Enter your password: ");
		String password = sin.next();

		currentStudent = studentService.getStudentByEmail(email);

		if (studentService.validateStudent(email, password)) {
			List<Course> courses = studentService.getStudentCourses(email);
			System.out.println("MyClasses");
			for (Course course : courses) {
				System.out.println(course);
			}
			retValue = true;
		} else {
			System.out.println("User Validation failed. GoodBye!");
		}
		return retValue;
	}

	private void registerMenu() {
		sb.append("\n1.Register a class\n2. Logout\nPlease Enter Selection: ");
		System.out.print(sb.toString());
		sb.delete(0, sb.length());

		switch (sin.nextInt()) {
		case 1:
			List<Course> allCourses = courseService.getAllCourses();
			List<Course> studentCourses = studentService.getStudentCourses(currentStudent.getsEmail());
			allCourses.removeAll(studentCourses);
			System.out.printf("%5s%15S%15s\n", "ID", "Course", "Instructor");
			for (Course course : allCourses) {
				System.out.println(course);
			}
			System.out.println();
			System.out.print("Enter Course Number: ");
			int number = sin.nextInt();

			studentService.registerStudentToCourse(currentStudent.getsEmail(), number);
			Student temp = studentService.getStudentByEmail(currentStudent.getsEmail());

			List<Course> sCourses = studentService.getStudentCourses(temp.getsEmail());

			System.out.println("MyClasses");

			System.out.printf("%-5s%-35S%-15s\n", "ID", "Course", "Instructor");

			for (Course course : sCourses) {
				System.out.println(sCourses);
				System.out.printf("%-5s%-35S%-15s\n", course.getcId(), course.getcName(), course.getcInstructorName());
			}
			
			break;
		case 2:
		default:
			System.out.println("Goodbye!");
		}

	}
}