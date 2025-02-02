import java.util.*;

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void modifySalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employeeID = sc.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Initial Salary: ");
        double salary = sc.nextDouble();

        Employee employee = new Employee(employeeID, department, salary);

        employee.displayEmployeeDetails();

        System.out.print("Enter new salary to modify: ");
        double newSalary = sc.nextDouble();
        employee.modifySalary(newSalary);

        employee.displayEmployeeDetails();

        Manager manager = new Manager(employeeID, department, salary);
        manager.displayManagerDetails();

    }
}
