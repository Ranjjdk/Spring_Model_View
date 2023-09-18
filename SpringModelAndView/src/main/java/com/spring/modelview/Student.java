package com.spring.modelview;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String studentName;
	private String studentEmail;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", studentEmail=" + studentEmail + "]";
	}
}
