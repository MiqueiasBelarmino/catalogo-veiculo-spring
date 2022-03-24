package com.belarmino.catalogo.controller;

import com.belarmino.catalogo.model.Vehicle;
import com.belarmino.catalogo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/")
    public ResponseEntity<List<Vehicle>> list(){
        return ResponseEntity.ok(vehicleService.list());
    }

    @PostMapping("/save")
    public ResponseEntity<Vehicle> save(@RequestBody Vehicle vehicle){
        return ResponseEntity.ok(vehicleService.save(vehicle));
    }
    @PostMapping("/brand")
    public ResponseEntity<List<Vehicle>> listByBrand(@RequestBody String brand){
        return ResponseEntity.ok(vehicleService.listByBrand(brand));
    }
}
