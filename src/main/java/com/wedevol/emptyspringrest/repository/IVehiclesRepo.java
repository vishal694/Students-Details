package com.wedevol.emptyspringrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wedevol.emptyspringrest.entity.Vehicles;

@Repository
public interface IVehiclesRepo extends JpaRepository<Vehicles, Long> {

}
