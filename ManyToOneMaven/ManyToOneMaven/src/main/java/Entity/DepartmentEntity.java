package Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class DepartmentEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptId;
	private String deptName;
	
	@OneToMany(targetEntity = TeacherEntity.class,cascade = {CascadeType.ALL})
	private List teacherList;
	
	
	// all args constructor
	public DepartmentEntity(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	// default constructor
	public DepartmentEntity() {
		
	}
	// Getters and Setters
	public int getDeptId() {
		return deptId;
	}

	public List getTeacherList() {
		return teacherList;
	}
	public void setTeacherList(List teacherList) {
		this.teacherList = teacherList;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
