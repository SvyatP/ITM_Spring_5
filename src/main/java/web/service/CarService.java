package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private final List<Car> cars = Arrays.asList(
            new Car(1, "Opel", "Zafira"),
            new Car(2, "Honda", "Civic"),
            new Car(3, "Ford", "Focus"),
            new Car(4, "Vaz", "2106"),
            new Car(5, "Porsche", "911")
    );

    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
