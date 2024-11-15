package practika10_2;

public class CorporateStructureDemo {
    public static void main(String[] args) {
        Department headOffice = new Department("Головной офис");

        Employee employee1 = new Employee("Алиса", "Менеджер", 80000);
        Employee employee2 = new Employee("Боб", "Аналитик", 60000);
        headOffice.add(employee1);
        headOffice.add(employee2);

        Department itDepartment = new Department("IT отдел");
        Employee employee3 = new Employee("Чарли", "Разработчик", 90000);
        itDepartment.add(employee3);

        headOffice.add(itDepartment);

        headOffice.display();
        System.out.println("Общий бюджет компании: " + headOffice.getBudget());
        System.out.println("Общее количество сотрудников: " + headOffice.getEmployeeCount());
    }
}

