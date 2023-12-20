package com.wedevol.emptyspringrest.service;

import java.util.List;
import java.util.Optional;

import com.wedevol.emptyspringrest.entity.Vehicles;

public interface IVehiclesService {

	public List<Vehicles> getBooks();

	public Optional<Vehicles> getBookById(String id);
}
