package domain.task2;

/**
 * @author PetSoft
 * @date 03.04.2024 22:42
 */
public class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        if (vehicle.getType().equalsIgnoreCase("Car")) {
            return vehicle.getMaxSpeed() * 0.8;
        } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
            return vehicle.getMaxSpeed() * 0.6;
        }
        return 0.0;
    }
}
