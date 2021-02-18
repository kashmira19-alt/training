package com.training.training.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name= "students")

public class Student {
	public Student() {
	}
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long studentid;
		
	    @Column
		private String studentname;
	    
	    @Column
		private String studentemail;
	    
	    @ManyToMany
	    private List<Course> courses;


		public List<Course> getCourses() {
			return courses;
		}

		public void setCourses(List<Course> courses) {
			this.courses = courses;
		}

		public Long getStudentid() {
			return studentid;
		}

		public void setStudentid(Long studentid) {
			this.studentid = studentid;
		}

		public String getStudentname() {
			return studentname;
		}

		public void setStudentname(String studentname) {
			this.studentname = studentname;
		}

		public String getStudentemail() {
			return studentemail;
		}

		public void setStudentemail(String studentemail) {
			this.studentemail = studentemail;
		}
	}
	   