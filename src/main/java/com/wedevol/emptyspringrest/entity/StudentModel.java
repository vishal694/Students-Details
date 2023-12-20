package com.wedevol.emptyspringrest.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@Table(name = "StudentsInfo")
public class StudentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long enrollmentNo;

	public String studentName;

	public Date birthDate;

	public String address;

	public String parentNumber;

	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "Students_books", joinColumns = @JoinColumn(name = "enrollment_no"), inverseJoinColumns = @JoinColumn(name = "book_id"))
	public Set<BooksModel> books = new HashSet<>();

	@Transient
	public Set<String> bookURLS = new HashSet<>();
	
	@Transient
	public Set<String> classURLS = new HashSet<>();
	
	@Transient
	public String vehicleURL;
	
	@JsonIgnore
	@OneToMany(targetEntity = StudentClassModel.class)
	@JoinColumn(name = "cp_fk", referencedColumnName = "enrollmentNo")
	public Set<StudentClassModel> studentClass = new HashSet<>();

	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "vehicle_Id")
	public Vehicles vehicle;
	
	public String marks;
	
	@Transient
	String url;
	
	public Long getEnrollmentNo() {
		return enrollmentNo;
	}

	public void setEnrollmentNo(Long enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getParentNumber() {
		return parentNumber;
	}

	public void setParentNumber(String parentNumber) {
		this.parentNumber = parentNumber;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}
	
	@JsonIgnore
	public Set<BooksModel> getBooks() {
		return books;
	}

	@JsonSetter
	public void setBooks(Set<BooksModel> books) {
		this.books = books;
	}
	
	@JsonIgnore
	public Set<StudentClassModel> getStudentClass() {
		return studentClass;
	}
	
	@JsonSetter
	public void setStudentClass(Set<StudentClassModel> studentClass) {
		this.studentClass = studentClass;
	}

	@JsonIgnore
	public Vehicles getVehicle() {
		return vehicle;
	}
	
	@JsonSetter
	public void setVehicle(Vehicles vehicle) {
		this.vehicle = vehicle;
	}

	public Set<String> getBookURLS() {
		return bookURLS;
	}

	public void setBookURLS(Set<String> bookURLS) {
		this.bookURLS = bookURLS;
	}

	public Set<String> getClassURLS() {
		return classURLS;
	}

	public void setClassURLS(Set<String> classURLS) {
		this.classURLS = classURLS;
	}

	public String getVehicleURL() {
		return vehicleURL;
	}

	public void setVehicleURL(String vehicleURL) {
		this.vehicleURL = vehicleURL;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
