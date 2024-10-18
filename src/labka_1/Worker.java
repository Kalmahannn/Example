package labka_1;

public class Worker extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Worker(String name, String employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId, "Жұмысшы");
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() + " | Сағатына Ставка: " + hourlyRate + " | Жұмыс уақыты: " + hoursWorked;
    }
}

