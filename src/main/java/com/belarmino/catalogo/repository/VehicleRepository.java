package com.belarmino.catalogo.repository;

import com.belarmino.catalogo.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

    List<Vehicle> findByBrand(String brand);
}
