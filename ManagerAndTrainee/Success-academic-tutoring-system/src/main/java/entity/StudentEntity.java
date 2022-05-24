package entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer student_Id;
	private String student_Name;
	
	
	
	 @ManyToMany(targetEntity = SessionEntity.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 private List<SessionEntity> studentEnrolledSubject = new ArrayList<>();
	
	public StudentEntity(Integer student_Id, String student_Name) {
		super();
		this.student_Id = student_Id;
		this.student_Name = student_Name;
	}

	public StudentEntity() {
		super();
	}

	public Integer getStudent_Id() {
		return student_Id;
	}

	public void setStudent_Id(Integer student_Id) {
		this.student_Id = student_Id;
	}

	public String getStudent_Name() {
		return student_Name;
	}

	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	
	
}
	
	
	
	
	
	