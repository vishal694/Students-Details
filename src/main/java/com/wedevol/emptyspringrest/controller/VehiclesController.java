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

import com.wedevol.emptyspringrest.entity.Vehicles;
import com.wedevol.emptyspringrest.service.IVehiclesService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api/vehicle")
@Api(tags = "Students having Vehicles", value = "vehicle Details", description = "Response result vehicle and students")
public class VehiclesController {

	@Autowired
	private IVehiclesService vehiclesService;

	@GetMapping
	public ResponseEntity<List<Vehicles>> getStudent() {

		ResponseEntity<List<Vehicles>> responseEntity = ResponseEntity.status(HttpStatus.OK)
				.body(vehiclesService.getBooks());

		return responseEntity;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Vehicles>> getStudentById(@PathVariable String id) {

		ResponseEntity<Optional<Vehicles>> responseEntity = ResponseEntity.status(HttpStatus.OK)
				.body(vehiclesService.getBookById(id));

		return responseEntity;
	}
}
