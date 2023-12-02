package kz.cars.carsapi.controllers;

import kz.cars.carsapi.dtos.CarDTO;
import kz.cars.carsapi.entities.Car;
import kz.cars.carsapi.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    private final CarService carService;

    @Autowired
    CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/add-car")
    public ResponseEntity<Car> addCar(@RequestBody Car car) {
        carService.addCar(car);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }

    @GetMapping("/car")
    public ResponseEntity<CarDTO> getCar(@RequestParam(name = "id") Long id) {
        Car car = carService.getCar(id);
        CarDTO carDTO = carService.convertToDTO(car);
        return new ResponseEntity<>(carDTO, HttpStatus.OK);
    }

    @GetMapping("/cars")
    public ResponseEntity<List<Car>> getCars() {
        List<Car> cars = carService.getAllCars();
        return new ResponseEntity<>(cars, HttpStatus.OK);
    }

    @PostMapping("/save-car")
    public ResponseEntity<Car> saveCar(@RequestBody Car car) {
        carService.saveCar(car);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }

    @DeleteMapping("/delete-car")
    public ResponseEntity<CarDTO> deleteCar(@RequestParam(name = "id") Long id) {
        Car car = carService.getCar(id);
        carService.deleteCar(car);
        CarDTO carDTO = carService.convertToDTO(car);
        return new ResponseEntity<>(carDTO, HttpStatus.OK);
    }
}