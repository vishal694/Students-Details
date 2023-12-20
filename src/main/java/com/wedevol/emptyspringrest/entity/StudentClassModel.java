package com.wedevol.emptyspringrest.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="DepartmentInfo")
public class StudentClassModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int classId;
	
	public String className;
	
	public String classTeacher;
	
	public String numberOfStudents;
	
	@Transient
	public Set<String> student = new HashSet<>();
	
	@Transient
	String url;
	
	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}

	public String getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(String numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public Set<String> getStudent() {
		return student;
	}

	public void setStudent(Set<String> student) {
		this.student = student;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
