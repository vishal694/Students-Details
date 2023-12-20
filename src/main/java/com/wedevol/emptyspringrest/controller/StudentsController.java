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

import com.wedevol.emptyspringrest.entity.StudentModel;
import com.wedevol.emptyspringrest.service.IStudentService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api/student")
@Api(tags = "Students having Books, Vehicle and Class", value = "students Details", description = "Response result students, books, vehicle and class")
public class StudentsController {

	@Autowired
	private IStudentService studentService;

	@GetMapping
	public ResponseEntity<List<StudentModel>> getStudent() {

		ResponseEntity<List<StudentModel>> responseEntity = ResponseEntity.status(HttpStatus.OK)
				.body(studentService.getStudents());

		return responseEntity;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<StudentModel>> getStudentById(@PathVariable String id) {

		ResponseEntity<Optional<StudentModel>> responseEntity = ResponseEntity.status(HttpStatus.OK)
				.body(studentService.getStudentById(id));

		return responseEntity;
	}
}
