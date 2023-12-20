package com.wedevol.emptyspringrest.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wedevol.emptyspringrest.entity.StudentModel;

@Repository
public interface IStudentInfoRepo extends JpaRepository<StudentModel, Long> {
	
	@Query(value = "SELECT CONCAT(:url, enrollment_No) FROM students_books where book_id = :bookId", nativeQuery = true)
	Set<String> findEnrollNoByBookId(@Param("bookId") Integer bookId, @Param("url") String url);
	
	@Query(value = "SELECT CONCAT(:url, cp_fk) FROM department_info where class_id = :classId", nativeQuery = true)
	Set<String> findEnrollNoByClassId(@Param("classId") Integer classId, @Param("url") String url);
	
	@Query(value = "SELECT CONCAT(:url, enrollment_No) FROM students_info where vehicle_id = :vehicleId", nativeQuery = true)
	Set<String> findEnrollNoByVehicle(@Param("vehicleId") Long vehicleId, @Param("url") String url);
	
}
