package kz.cars.carsapi.repositories;

import kz.cars.carsapi.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByBrand(String brand);
    List<Car> findByModel(String model);
    List<Car> findByCost(int cost);
}