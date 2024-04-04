package domain.task5;

/**
 * @author PetSoft
 * @date 03.04.2024 22:48
 */
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}
