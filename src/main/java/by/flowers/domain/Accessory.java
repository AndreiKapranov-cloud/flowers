package by.flowers.domain;

import java.time.LocalDateTime;

public class Accessory {
    protected String name;
    protected String colour;
    protected double price;

    public Accessory(String name, String colour, double price) {

        this.name = name;
        this.colour = colour;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
