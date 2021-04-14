package by.flowers.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class AbstractFlower implements Comparable<AbstractFlower>{
    protected Kind kind;
    protected String colour;
    protected int length;
    protected LocalDateTime whenCut;
    protected double price;

    public AbstractFlower(Kind kind, String colour, int length, LocalDateTime whenCut, double price) {
        this.kind = kind;
        this.colour = colour;
        this.length = length;
        this.whenCut = whenCut;
        this.price = price;
    }

    public AbstractFlower(String colour, double price) {
        this.colour = colour;
        this.price = price;
    }

    public AbstractFlower() {

    }

    public Kind getKind() {
        return kind;

    }

    public void setKind(Kind kind) {
        this.kind = kind;

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public LocalDateTime getWhenCut() {
        return whenCut;
    }

    public void setWhenCut(LocalDateTime whenCut) {
        this.whenCut = whenCut;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractFlower that = (AbstractFlower) o;
        return length == that.length && price == that.price && kind == that.kind && Objects.equals(colour, that.colour)
                && Objects.equals(whenCut, that.whenCut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, colour, length, whenCut, price);
    }

    @Override
    public String toString() {
        return "AbstractFlower{" +
                "kind=" + kind +
                ", colour='" + colour + '\'' +
                ", length=" + length +
                ", whenCut=" + whenCut +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(AbstractFlower abstractFlower) {
        if (this.whenCut.compareTo(abstractFlower.whenCut) < 0) {
            return -1;
        }
        if (this.whenCut.compareTo(abstractFlower.whenCut) > 0) {
            return 1;
        }
        if (this.whenCut.compareTo(abstractFlower.whenCut) == 0) {
            int result = this.whenCut.compareTo(abstractFlower.whenCut);

            return 0;
        }
return 0;
    }
}
