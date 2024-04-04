package domain;

import domain.task3.Shape;

/**
 * @author PetSoft
 * @date 03.04.2024 22:45
 */
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double volume() {
        throw new UnsupportedOperationException();
    }
}
