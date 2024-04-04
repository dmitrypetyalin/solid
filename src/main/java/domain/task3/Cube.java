package domain;

import domain.task3.Shape;

/**
 * @author PetSoft
 * @date 03.04.2024 22:46
 */
public class Cube implements Shape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
