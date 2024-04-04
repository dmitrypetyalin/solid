package domain.task1;

/**
 * @author PetSoft
 * @date 04.04.2024 9:52
 */
public class Accounting {
    public int calculateNetSalary(Employee employee) {
        int tax = (int) (employee.getBaseSalary() * 0.25);//calculate in otherway
        return employee.getBaseSalary() - tax;
    }
}
