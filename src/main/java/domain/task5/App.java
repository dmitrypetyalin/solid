package domain.task5;

/**
 * @author PetSoft
 * @date 04.04.2024 10:52
 */
public class App {
    public static void main(String[] args) {
        new Car(new PetrolEngine()).start();
        new Car(new DieselEngine()).start();
        new Car(new ElectricEngine()).start();
    }
}
