package by.flower.domain;

import by.flowers.domain.AbstractFlower;
import by.flowers.domain.Kind;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;


public class AbstractFlowerTest {
    @Test
    public void testGetColour() {
        AbstractFlower rose = new AbstractFlower(Kind.ROSE, "blue", 1,
                LocalDateTime.parse("2021-04-12T12:12:12.765"), 2);
        assertEquals(rose.getColour(), "blue");

    }
}
