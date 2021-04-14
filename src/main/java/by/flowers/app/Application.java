package by.flowers.app;

import by.flowers.domain.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Application {
    public static void main(String[] args) {


        List<AbstractFlower> bouquet = new ArrayList<>();
        AbstractFlower rose = new AbstractFlower(Kind.ROSE, "red", 50,
                LocalDateTime.parse("2021-04-01T12:00:21.655"), 0.5);
        bouquet.add(rose);
        AbstractFlower forgemenot = new AbstractFlower(Kind.FORGETMENOT, "violet", 40,
                LocalDateTime.parse("2021-04-02T12:12:12.765"), 0.4);
        bouquet.add(forgemenot);
        AbstractFlower pion = new AbstractFlower(Kind.PION, "purple", 45,
                LocalDateTime.parse("2021-04-05T12:12:12.765"), 0.45);
        bouquet.add(pion);

   Accessory corrugatedPaper = new Accessory("paper", "black", 0.3);

   Accessory ribbon = new Accessory("ribbon", "blue", 0.2);

        System.out.println(bouquet);
        double priceOfBouquetWithAccessories= PriceOfFlowers.price(bouquet) + corrugatedPaper.getPrice() +
                ribbon.getPrice();
        System.out.println("Price of bouquet with accessories = "+ priceOfBouquetWithAccessories);
        Functions.run(bouquet);

    }
}
