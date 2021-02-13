package com.training.training.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name= "collages")

public class Collage {
	public Collage() {
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clgid;
	
	        @Column
			private String clgname;
		    
		    @Column
			private String cemail;
		    
		    public Long getId() {
				return this.clgid;
		    		
		    }
		    
		    public String getName() {
				return this.clgname;
			}
			public void setName(String clgname) {
				this.clgname = clgname;
			}
			public String getEmail() {
				return this.cemail;
			}
			
			public void setEmail(String cemail) {
				this.cemail = cemail;
			}

			
	}
