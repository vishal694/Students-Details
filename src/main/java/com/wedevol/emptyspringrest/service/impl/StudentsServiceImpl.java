package com.wedevol.emptyspringrest.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedevol.emptyspringrest.constant.ApiConstants;
import com.wedevol.emptyspringrest.entity.BooksModel;
import com.wedevol.emptyspringrest.entity.StudentClassModel;
import com.wedevol.emptyspringrest.entity.StudentModel;
import com.wedevol.emptyspringrest.repository.IStudentInfoRepo;
import com.wedevol.emptyspringrest.service.IStudentService;

@Service
public class StudentsServiceImpl implements IStudentService {

	@Autowired
	private IStudentInfoRepo studentRepo;

	@Override
	public List<StudentModel> getStudents() {
		List<StudentModel> studentsList = studentRepo.findAll();

		for (StudentModel students : studentsList) {
			Set<String> bookSet = new HashSet<>();
			for (BooksModel booksModel : students.getBooks()) {
				bookSet.add(ApiConstants.bookURL + booksModel.getBookId());
				students.setBookURLS(bookSet);
			}

			Set<String> classSet = new HashSet<>();
			for (StudentClassModel studentClassModel : students.getStudentClass()) {
				classSet.add(ApiConstants.classURL + studentClassModel.getClassId());
				students.setClassURLS(classSet);
			}

			students.setVehicleURL(ApiConstants.vehicleURL + students.getVehicle().getVehicleId());
			students.setUrl(ApiConstants.studentURL + students.getEnrollmentNo());
		}
		return studentsList;
	}

	@Override
	public Optional<StudentModel> getStudentById(String id) {
		Optional<StudentModel> studentsOptionalList = studentRepo.findById(Long.parseLong(id));

		for (BooksModel booksModel : studentsOptionalList.get().getBooks()) {
			Set<String> set = new HashSet<>();
			set.add(ApiConstants.bookURL + booksModel.getBookId());
			studentsOptionalList.get().setBookURLS(set);
		}

		for (StudentClassModel studentClassModel : studentsOptionalList.get().getStudentClass()) {
			Set<String> set = new HashSet<>();
			set.add(ApiConstants.classURL + studentClassModel.getClassId());
			studentsOptionalList.get().setClassURLS(set);
		}

		studentsOptionalList.get()
				.setVehicleURL(ApiConstants.vehicleURL + studentsOptionalList.get().getVehicle().getVehicleId());
		studentsOptionalList.get().setUrl(ApiConstants.studentURL + id);
		return studentsOptionalList;
	}

}
