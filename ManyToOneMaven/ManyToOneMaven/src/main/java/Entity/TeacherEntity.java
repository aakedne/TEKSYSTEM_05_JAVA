package Entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import org.hibernate.mapping.Set;

@Entity
@Table
public class TeacherEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teachID;
	private String salary;
	private String teacherName;
	
	
	//Foreign key = department
//	@ManyToOne
//	@JoinColumn(name="fkey_dept")
//	private DepartmentEntity department;
	
	//all args constructor
	// could have a problem later
	
	@ManyToMany(targetEntity = CohortEntity.class)
	private Set cohortSet;
	
	
	
	
	public TeacherEntity(int teachID, String salary, String teacherName, Set cohortSet) {
		super();
		this.teachID = teachID;
		this.salary = salary;
		this.teacherName = teacherName;
		this.cohortSet = cohortSet;
		// this department?
//		this.department = department;
	}
	// no arg constructor
	public TeacherEntity() {
		
	}
	// Getters and Setters
    public Set getCohortSet() {
		return cohortSet;
	}
	public void setCohortSet(Set cohortSet) {
		this.cohortSet = cohortSet;
	}
	
	public int getTeachID() {
		return teachID;
	}

	public void setTeachID(int teachID) {
		this.teachID = teachID;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

//	public DepartmentEntity getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(DepartmentEntity department) {
//		this.department = department;
//	}
//	
	
	
	

}
