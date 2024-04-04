package domain.task4;

/**
 * @author PetSoft
 * @date 04.04.2024 12:56
 */
public class App {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 30);
        Rectangle square = new Square(20);
        System.out.println(rectangle.area());
        System.out.println(square.area());
    }
}
