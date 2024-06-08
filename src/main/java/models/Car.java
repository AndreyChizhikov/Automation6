package models;

import java.util.Objects;

public class Car {
    private final String color;
    private final Double engine;

    public String getColor() {
        return color;
    }

    public Double getEngine() {
        return engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car cars)) return false;
        return Objects.equals(getColor(), cars.getColor()) && Objects.equals(getEngine(), cars.getEngine());
   }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getEngine());
    }

    public Car(String color, Double engine)
    {
        this.color = color;
        this.engine = engine;
    }
}
