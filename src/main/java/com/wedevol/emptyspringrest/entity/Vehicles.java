package com.wedevol.emptyspringrest.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "VehiclesInfo")
public class Vehicles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long vehicleId;
	
	public String vehicleName;
	
	public String vehicleCompany;
		
	public String numberPlate;
	
	@OneToOne(mappedBy = "vehicle")
	@JsonBackReference
	public StudentModel studentVehicle;
	
	@Transient
	public Set<String> student = new HashSet<>();
	
	@Transient
	String url;
	
	public Long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleCompany() {
		return vehicleCompany;
	}

	public void setVehicleCompany(String vehicleCompany) {
		this.vehicleCompany = vehicleCompany;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public StudentModel getStudentVehicle() {
		return studentVehicle;
	}

	public void setStudentVehicle(StudentModel studentVehicle) {
		this.studentVehicle = studentVehicle;
	}

	public Set<String> getStudent() {
		return student;
	}

	public void setStudent(Set<String> student) {
		this.student = student;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
