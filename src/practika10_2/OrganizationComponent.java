package practika10_2;

abstract class OrganizationComponent {
    protected String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public void add(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public abstract void display();
    public abstract double getBudget();
    public abstract int getEmployeeCount();
}


