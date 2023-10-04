package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carsList = new ArrayList<>(5);

    @Override
    public List<Car> getCertainNumberOfCars(Byte number) {

        carsList.add(new Car("Kia Elan", (short) 1996, 3.9));
        carsList.add(new Car("Kia Pride", (short) 2005, 2.7));
        carsList.add(new Car("Kia Kue", (short) 2004, 2.8));
        carsList.add(new Car("Kia GT Concept", (short) 2009, 3.6));
        carsList.add(new Car("Kia Rio", (short) 2011, 2.1));

        number = number > 5 ? 5 : number;
        return carsList.stream().limit(number).collect(Collectors.toList());
    }


}
