class Employee {

    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Kushagra ", 118, 5000000);
        Employee emp2 = new Employee("Om", 125, 400000);
		emp1.displayDetails();
        emp2.displayDetails();
    }
}
