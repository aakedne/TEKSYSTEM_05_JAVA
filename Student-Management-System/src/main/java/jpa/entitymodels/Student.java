package jpa.entitymodels;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "student")
public class Student<Course> {
    @Id 
    @Column(name = "email", nullable = false, columnDefinition = "VARCHAR(50)")
    private String sEmail;     

    @Basic 
    private String sName;

    @Basic
    @Column (name= "password")
    private String sPass;

    @ManyToMany
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name ="sEmail",referencedColumnName = "email"),
            inverseJoinColumns = @JoinColumn(name= "cId", referencedColumnName = "id")
    )
    private List<Course> sCourses= new ArrayList<>();



    public Student() {
        super();

    }

   


    public Student(String sEmail, String sName, String sPass, List<Course> sCourses) {
       super();
        this.sEmail = sEmail;
        this.sName = sName;
        this.sPass = sPass;
        this.sCourses = sCourses;
    }
    
    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsPass() {
        return sPass;
    }

    public void setsPass(String sPass) {
        this.sPass = sPass;
    }

    public List<Course> getsCourses() {
        return sCourses;
    }

    public void setsCourses(List<Course> sCourses) {
        this.sCourses = sCourses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sEmail='" + sEmail + '\'' +
                ", sName='" + sName + '\'' +
                ", sPass='" + sPass + '\'' +
                '}';
    }
}