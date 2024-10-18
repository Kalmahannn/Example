package labka_1;

public abstract class Employee {
    private String name;
    private String employeeId;
    private String position;

    public Employee(String name, String employeeId, String position) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getPosition() {
        return position;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Аты: " + name + " | ID: " + employeeId + " |Лауазымы: " + position;
    }
}
