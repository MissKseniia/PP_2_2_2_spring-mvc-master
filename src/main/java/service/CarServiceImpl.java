package service;

import models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> makeList() {
        List<Car> list = new ArrayList<>(5);
        list.add(new Car("Kia Elan", (short) 1996, 3.9));
        list.add(new Car("Kia Pride", (short) 2005, 2.7));
        list.add(new Car("Kia Kue", (short) 2004, 2.8));
        list.add(new Car("Kia GT Concept", (short) 2009, 3.6));
        list.add(new Car("Kia Rio", (short) 2011, 2.1));
        return list;
    }

    @Override
    public List<Car> getCars(List<Car> carList, Byte number) {
        return carList.subList(0, number);
    }


}
