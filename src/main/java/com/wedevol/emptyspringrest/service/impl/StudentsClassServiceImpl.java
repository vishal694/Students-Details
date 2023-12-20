package com.wedevol.emptyspringrest.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedevol.emptyspringrest.constant.ApiConstants;
import com.wedevol.emptyspringrest.entity.StudentClassModel;
import com.wedevol.emptyspringrest.repository.IStudentClassRepo;
import com.wedevol.emptyspringrest.repository.IStudentInfoRepo;
import com.wedevol.emptyspringrest.service.IStudentClassService;

@Service
public class StudentsClassServiceImpl implements IStudentClassService {

	@Autowired
	private IStudentClassRepo studentClassRepo;

	@Autowired
	private IStudentInfoRepo studentRepo;

	@Override
	public List<StudentClassModel> getClassDetail() {

		List<StudentClassModel> studentClassList = studentClassRepo.findAll();

		for (StudentClassModel studentClassModel : studentClassList) {
			studentClassModel.setStudent(
					studentRepo.findEnrollNoByClassId(studentClassModel.getClassId(), ApiConstants.studentURL));
			studentClassModel.setUrl(ApiConstants.classURL + studentClassModel.getClassId());
		}
		return studentClassList;
	}

	@Override
	public Optional<StudentClassModel> getClassDetailById(String id) {
		Optional<StudentClassModel> studentClassOptionalList = studentClassRepo.findById(Integer.parseInt(id));

		studentClassOptionalList.get()
				.setStudent(studentRepo.findEnrollNoByClassId(Integer.parseInt(id), ApiConstants.studentURL));
		studentClassOptionalList.get().setUrl(ApiConstants.classURL + id);
		return studentClassOptionalList;
	}

}
