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

import com.wedevol.emptyspringrest.entity.BooksModel;
import com.wedevol.emptyspringrest.service.IBooksService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api/book")
@Api(tags = "Students having Books", value = "Books Details", description = "Response result books and students")
public class BooksController {

	@Autowired
	private IBooksService booksService;

	@GetMapping
	public ResponseEntity<List<BooksModel>> getBooks() {

		ResponseEntity<List<BooksModel>> responseEntity = ResponseEntity.status(HttpStatus.OK)
				.body(booksService.getBooks());

		return responseEntity;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<BooksModel>> getBooksById(@PathVariable String id) {

		ResponseEntity<Optional<BooksModel>> responseEntity = ResponseEntity.status(HttpStatus.OK)
				.body(booksService.getBookById(id));

		return responseEntity;
	}
}
