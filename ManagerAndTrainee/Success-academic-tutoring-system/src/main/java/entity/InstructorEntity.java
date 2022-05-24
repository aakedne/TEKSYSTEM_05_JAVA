package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class InstructorEntity {
	@Id // Id is primary key for the instructorEntity
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int InstructorId;
	private String InstructorName;
	private String InstructorSalary;
	private String InstructorSubject;

	@ManyToOne // Relationship
	private SubjectEntity subject;   //acting as a foreign key = subject
	private String instructorSubject;

	// all args constructor

	public InstructorEntity(int instructorId, String instructorName, String instructorSalary, String InstructorSubject) {
		super();
		InstructorId = instructorId;
		InstructorName = instructorName;
		InstructorSalary = instructorSalary;
		InstructorSubject = instructorSubject;
	}

	// Default constructor
	public InstructorEntity() {
		super();

	}
	// Getters and Setters

	public int getInstructorId() {
		return InstructorId;
	}

	public void setInstructorId(int instructorId) {
		InstructorId = instructorId;
	}

	public String getInstructorName() {
		return InstructorName;
	}

	public String setInstructorName(String instructorName) {
		return  instructorName;
	}

	public String getInstructorSalary() {
		return InstructorSalary;
	}

	public void setInstructorSalary(String instructorSalary) {
		InstructorSalary = instructorSalary;
	}

	public String getInstructorSubject() {
		return instructorSubject;
	}

	public void setInstructorSubject(String instructorSubject) {
		this.instructorSubject = instructorSubject;
	}
	

}
