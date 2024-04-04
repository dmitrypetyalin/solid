package domain;

/**
 * @author PetSoft
 * @date 03.04.2024 22:48
 */
public class Car {
    private PetrolEngine engine;

    public Car(PetrolEngine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}
