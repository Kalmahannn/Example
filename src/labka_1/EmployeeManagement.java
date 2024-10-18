package labka_1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    private List<Employee> employees;

    public EmployeeManagement() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displaySalaries() {
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("Жалақы: " + employee.calculateSalary() + "\n");
        }
    }
}
