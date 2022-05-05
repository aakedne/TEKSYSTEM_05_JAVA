package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cohort")
public class CohortEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cohortId;
	private String cohortName;
	private String duration;
	
	// all args constructors
	public CohortEntity(int cohortId, String cohortName, String duration) {
		super();
		this.cohortId = cohortId;
		this.cohortName = cohortName;
		this.duration = duration;
	}
	// No args/default

	public CohortEntity() {
		super();
	}

	// Getters and setters
	public int getCohortId() {
		return cohortId;
	}

	public void setCohortId(int cohortId) {
		this.cohortId = cohortId;
	}

	public String getCohortName() {
		return cohortName;
	}

	public void setCohortName(String cohortName) {
		this.cohortName = cohortName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	

	
	
}
