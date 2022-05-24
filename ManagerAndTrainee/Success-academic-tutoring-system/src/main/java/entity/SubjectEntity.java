package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SubjectEntity implements Serializable {

	@Id // primary key for subject table
	@GeneratedValue(strategy = GenerationType.IDENTITY) // creates primary key
	private int subjectId;
	private String subjectName;
	private String subjectSchedule;

	// default constructor
	public SubjectEntity() {
		super();

	}

	// all args constructor
	public SubjectEntity(int subjectId, String subjectName, String subjectSchedule) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.subjectSchedule = subjectSchedule;
	}

	// Getters and setters
	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectSchedule() {
		return subjectSchedule;
	}

	public void setSubjectSchedule(String subjectSchedule) {
		this.subjectSchedule = subjectSchedule;
	}

}
