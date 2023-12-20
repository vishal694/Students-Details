package com.wedevol.emptyspringrest.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedevol.emptyspringrest.constant.ApiConstants;
import com.wedevol.emptyspringrest.entity.Vehicles;
import com.wedevol.emptyspringrest.repository.IStudentInfoRepo;
import com.wedevol.emptyspringrest.repository.IVehiclesRepo;
import com.wedevol.emptyspringrest.service.IVehiclesService;

@Service
public class VehiclesServiceImpl implements IVehiclesService {

	@Autowired
	private IVehiclesRepo vehicleRepo;

	@Autowired
	private IStudentInfoRepo studentRepo;

	@Override
	public List<Vehicles> getBooks() {
		List<Vehicles> vehicleList = vehicleRepo.findAll();

		for (Vehicles vehicles : vehicleList) {
			vehicles.setStudent(studentRepo.findEnrollNoByVehicle(vehicles.getVehicleId(), ApiConstants.studentURL));
			vehicles.setUrl(ApiConstants.bookURL + vehicles.getVehicleId());
		}
		return vehicleList;
	}

	@Override
	public Optional<Vehicles> getBookById(String id) {
		Optional<Vehicles> vehiclesOptionalList = vehicleRepo.findById(Long.parseLong(id));
		vehiclesOptionalList.get()
				.setStudent(studentRepo.findEnrollNoByVehicle(Long.parseLong(id), ApiConstants.studentURL));
		vehiclesOptionalList.get().setUrl(ApiConstants.bookURL + id);
		return vehiclesOptionalList;
	}

}
