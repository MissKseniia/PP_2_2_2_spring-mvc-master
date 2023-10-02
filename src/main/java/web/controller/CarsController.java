package web.controller;

import models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {


    @GetMapping(value = "/askCount")
    public String askCount() {
        return "askCount";
    }

    @GetMapping(value = "/cars")
    public String showCars1(@RequestParam("count") Byte count, ModelMap model) {
        if (count > 5 || count < 0) {
            return "askCount";
        }
        CarService service = new CarServiceImpl();
        List<Car> cars = service.getCars(service.makeList(), count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
