package domain.task2;

/**
 * @author PetSoft
 * @date 04.04.2024 12:47
 */
public class App {
    public static void main(String[] args) {
        System.out.println(new SpeedCalculation().calculateAllowedSpeed(new Car(100, "Car")));
        System.out.println(new SpeedCalculation().calculateAllowedSpeed(new Bus(100, "Bus")));
    }
}
