package com.wedevol.emptyspringrest.service;

import java.util.List;
import java.util.Optional;

import com.wedevol.emptyspringrest.entity.StudentModel;

public interface IStudentService {

	public List<StudentModel> getStudents();

	public Optional<StudentModel> getStudentById(String id);

}
