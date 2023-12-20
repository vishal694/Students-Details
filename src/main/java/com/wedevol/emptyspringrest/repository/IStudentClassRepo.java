package com.wedevol.emptyspringrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wedevol.emptyspringrest.entity.StudentClassModel;

@Repository
public interface IStudentClassRepo extends JpaRepository<StudentClassModel, Integer> {

}
