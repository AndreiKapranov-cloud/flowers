package by.flowers.domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Functions {
    public static void run(List<AbstractFlower> bouquet) {
        System.out.println("---------------------------------------------------");
        System.out.println("Sort the flowers in the bouquet by date they were cut: ");
        Collections.sort(bouquet);//sort by date when the flower was cut,watch compareTo method
        bouquet.forEach(System.out::println);
        System.out.println("---------------------------------------------------");
        System.out.println("The flowers having length between 33 and 43 sm:");
        List<AbstractFlower> collected = bouquet.stream()
                .filter(flower -> flower.getLength() > 33 && flower.getLength() < 43)
                .collect(Collectors.toList());
        collected.forEach(System.out::println);
    }
}
