package com.wedevol.emptyspringrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wedevol.emptyspringrest.entity.StudentClassModel;
import com.wedevol.emptyspringrest.service.IStudentClassService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api/class")
@Api(tags = "Students having Class", value = "class Details", description = "Response result class and students")
public class StudentClassController {
	
	@Autowired
	private IStudentClassService studentClassService;
	
	@GetMapping
	public ResponseEntity<List<StudentClassModel>> getStudent() {

		ResponseEntity<List<StudentClassModel>> responseEntity = ResponseEntity.status(HttpStatus.OK)
				.body(studentClassService.getClassDetail());

		return responseEntity;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<StudentClassModel>> getStudentById(@PathVariable String id) {

		ResponseEntity<Optional<StudentClassModel>> responseEntity = ResponseEntity.status(HttpStatus.OK)
				.body(studentClassService.getClassDetailById(id));

		return responseEntity;
	}

}
