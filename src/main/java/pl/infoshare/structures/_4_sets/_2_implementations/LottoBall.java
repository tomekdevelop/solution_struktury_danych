package pl.infoshare.structures._4_sets._2_implementations;

import java.util.Objects;

public class LottoBall implements Comparable<LottoBall> {

    private final String color;
    private final Integer value;

    public LottoBall(String color, Integer value) {
        this.color = color;
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "LottoBall{" +
                "color='" + color + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoBall lottoBall = (LottoBall) o;
        return Objects.equals(color, lottoBall.color) &&
                Objects.equals(value, lottoBall.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, value);
    }

    @Override
    public int compareTo(LottoBall o) {
        return value.compareTo(o.value);
    }
}
