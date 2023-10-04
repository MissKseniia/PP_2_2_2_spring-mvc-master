package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import web.models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.List;

@Controller
public class CarsController {

    private final CarService service;

    @Autowired
    public CarsController(CarService service) {
        this.service = service;
    }

    @GetMapping(value = "/cars")
    public String showCars1(@RequestParam(value = "count", defaultValue = "5") Byte count, ModelMap model) {

        List<Car> cars = service.getCertainNumberOfCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
