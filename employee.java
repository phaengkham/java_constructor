public class employee {

    private String id;
    private String name;
    private double salary;

    public employee() {
        this.id = "001";
        this.name = "phaengkham";
        this.salary = 8000000.0;
    }

    public void displayEmployee() {
        System.out.println("ID = " + this.id);
        System.out.println("Name = " + this.name);
        System.out.println("salary = " + this.salary);
    }

    public void showEmployee() {
        System.out.println("Name = " + this.name);
        System.out.println("Salary = " + this.salary);
    }

    public employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        showEmployee();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return this.salary;
    }
}