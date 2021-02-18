package com.training.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "courses")

public class Course {
	public Course() {
	}
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long studentid;
		
	    public Long getStudentid() {
			return studentid;
		}

		public void setStudentid(Long studentid) {
			this.studentid = studentid;
		}

		@Column
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	    
	    

}
