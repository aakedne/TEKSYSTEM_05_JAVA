package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.security.auth.Subject;

@Entity
@Table
public class SessionEntity {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer sessionNumber;
	    private String  sessionName;
	    private int    sessionSchedule;
	    
	    @ManyToOne (targetEntity = Subject.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	    private List<Subject> classLessons = new ArrayList<>();

		public SessionEntity(Integer sessionNumber, String sessionName, int sessionSchedule,
				List<Subject> classLessons) {
			super();
			this.sessionNumber = sessionNumber;
			this.sessionName = sessionName;
			this.sessionSchedule = sessionSchedule;
			this.classLessons = classLessons;
		}

		public SessionEntity() {
			super();
		}

		public Integer getSessionNumber() {
			return sessionNumber;
		}

		public void setSessionNumber(Integer sessionNumber) {
			this.sessionNumber = sessionNumber;
		}

		public String getSessionName() {
			return sessionName;
		}

		public void setSessionName(String sessionName) {
			this.sessionName = sessionName;
		}

		public int getSessionSchedule() {
			return sessionSchedule;
		}

		public void setSessionSchedule(int sessionSchedule) {
			this.sessionSchedule = sessionSchedule;
		}

		public List<Subject> getClassLessons() {
			return classLessons;
		}

		public void setClassLessons(List<Subject> classLessons) {
			this.classLessons = classLessons;
		}
	
	    
	    
}
