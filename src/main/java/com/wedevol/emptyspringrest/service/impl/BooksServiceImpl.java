package com.wedevol.emptyspringrest.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedevol.emptyspringrest.constant.ApiConstants;
import com.wedevol.emptyspringrest.entity.BooksModel;
import com.wedevol.emptyspringrest.repository.IBooksRepo;
import com.wedevol.emptyspringrest.repository.IStudentInfoRepo;
import com.wedevol.emptyspringrest.service.IBooksService;

@Service
public class BooksServiceImpl implements IBooksService {

	@Autowired
	private IBooksRepo bookRepo;

	@Autowired
	private IStudentInfoRepo studentRepo;

	@Override
	public List<BooksModel> getBooks() {

		List<BooksModel> bookList = bookRepo.findAll();

		for (BooksModel bookModel : bookList) {
			bookModel.setStudent(studentRepo.findEnrollNoByBookId(bookModel.bookId, ApiConstants.studentURL));

			bookModel.setUrl(ApiConstants.bookURL + bookModel.getBookId());
		}
		return bookList;
	}

	@Override
	public Optional<BooksModel> getBookById(String id) {

		Optional<BooksModel> booksOptionallist = bookRepo.findById(Integer.parseInt(id));

		booksOptionallist.get()
				.setStudent(studentRepo.findEnrollNoByBookId(booksOptionallist.get().bookId, ApiConstants.studentURL));

		booksOptionallist.get().setUrl(ApiConstants.bookURL + id);
		return booksOptionallist;
	}

}
