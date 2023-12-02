package kz.cars.carsapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarDTO {
    private Long id;
    private String brand;
    private String model;
    private int cost;
}
