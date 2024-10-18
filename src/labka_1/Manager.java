package labka_1;

public class Manager extends Employee {
    private double fixedSalary;
    private double bonus;

    public Manager(String name, String employeeId, double fixedSalary, double bonus) {
        super(name, employeeId, "Менеджер");
        this.fixedSalary = fixedSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " | Тұрақты жалақы:" + fixedSalary + " | Сыйлық: " + bonus;
    }
}
