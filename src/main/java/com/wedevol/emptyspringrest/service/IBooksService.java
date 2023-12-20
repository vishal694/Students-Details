package com.wedevol.emptyspringrest.service;

import java.util.List;
import java.util.Optional;

import com.wedevol.emptyspringrest.entity.BooksModel;

public interface IBooksService {

	public List<BooksModel> getBooks();
	
	public Optional<BooksModel> getBookById(String id);
}
