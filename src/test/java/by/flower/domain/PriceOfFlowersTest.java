package by.flower.domain;

import by.flowers.domain.AbstractFlower;
import by.flowers.domain.Kind;
import by.flowers.domain.PriceOfFlowers;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PriceOfFlowersTest {

    @Test
    public void PriceTest() {
        List<AbstractFlower> roses = new ArrayList<>();
        AbstractFlower rose = new AbstractFlower(Kind.ROSE, "black", 3,
                LocalDateTime.parse("2021-04-10T12:12:12.857"), 1);
        roses.add(rose);
        AbstractFlower rose1 = new AbstractFlower(Kind.ROSE, "black", 3,
                LocalDateTime.parse("2021-04-10T12:12:12.857"), 1.2);
        roses.add(rose1);
        PriceOfFlowers.price(roses);
        assertEquals(PriceOfFlowers.price(roses), 2.2,0.0000002);
    }
}