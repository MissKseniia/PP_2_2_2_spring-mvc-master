package models;

import org.springframework.stereotype.Component;

@Component("carBean")
public class Car {

    private String model;
    private short releaseYear;
    private double price;

    public Car() {
    }

    public Car(String model, short releaseYear, double price) {
        this.model = model;
        this.releaseYear = releaseYear;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public short getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(short releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", releaseYear=" + releaseYear +
                ", price=" + price +
                '}';
    }
}
