package service;

import models.Car;

import java.util.List;

public interface CarService {

    public List<Car> makeList();

    public List<Car> getCars(List<Car> carList, Byte number);

}
