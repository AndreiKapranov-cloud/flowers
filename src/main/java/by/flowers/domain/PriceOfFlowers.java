package by.flowers.domain;

import java.util.List;

public class PriceOfFlowers {
    public static double price(List<AbstractFlower> bouquet) {
        double sumOfBouquet = bouquet.stream()
                .mapToDouble(x -> x.getPrice())
                .sum();
        return sumOfBouquet;
    }
}