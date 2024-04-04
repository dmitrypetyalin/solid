package domain.task1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author PetSoft
 * @date 04.04.2024 10:56
 */
public class App {
    public static void main(String[] args) {
        System.out.println(new Accounting()
                .calculateNetSalary(new Employee("Robert Martin", new GregorianCalendar(1952, Calendar.DECEMBER, 5).getTime(), 15000)));
    }
}
