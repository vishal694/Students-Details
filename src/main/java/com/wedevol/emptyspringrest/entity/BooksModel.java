package com.wedevol.emptyspringrest.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "BooksInfo")
public class BooksModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int bookId;

	public String name;

	public String pages;
	
	@JsonIgnore
    @ManyToMany(mappedBy = "books")
    public Set<StudentModel> students = new HashSet<>();
	
	@Transient
	Set<String> student = new HashSet<>();
	
	@Transient
	String url;
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public Set<StudentModel> getStudents() {
		return students;
	}

	public void setStudents(Set<StudentModel> students) {
		this.students = students;
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
