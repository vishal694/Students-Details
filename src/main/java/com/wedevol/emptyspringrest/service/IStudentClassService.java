package com.wedevol.emptyspringrest.service;

import java.util.List;
import java.util.Optional;

import com.wedevol.emptyspringrest.entity.StudentClassModel;

public interface IStudentClassService {

    public List<StudentClassModel> getClassDetail();
	
	public Optional<StudentClassModel> getClassDetailById(String id);
}
