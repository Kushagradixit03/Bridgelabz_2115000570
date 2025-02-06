import java.util.ArrayList;
import java.util.List;

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    public void removeDepartment(String departmentName) {
        departments.removeIf(department -> department.getName().equals(departmentName));
    }

    public void displayDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department department : departments) {
            System.out.println(department.getName());
        }
    }

    public void addEmployeeToDepartment(String departmentName, String employeeName, String position) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                department.addEmployee(employeeName, position);
                return;
            }
        }
        System.out.println("Department not found.");
    }

    public void removeEmployeeFromDepartment(String departmentName, String employeeName) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                department.removeEmployee(employeeName);
                return;
            }
        }
        System.out.println("Department or Employee not found.");
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(String name, String position) {
        employees.add(new Employee(name, position));
    }

    public void removeEmployee(String name) {
        employees.removeIf(employee -> employee.getName().equals(name));
    }

    public void displayEmployees() {
        System.out.println("Employees in " + name + " Department:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - " + employee.getPosition());
        }
    }
}

class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
}

public class CompanyDemo {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        company.addDepartment("Engineering");
        company.addDepartment("Marketing");

        company.addEmployeeToDepartment("Engineering", "Aman", "Software Engineer");
        company.addEmployeeToDepartment("Engineering", "Kushagra", "DevOps Engineer");
        company.addEmployeeToDepartment("Marketing", "Rohan", "Marketing Manager");

        company.displayDepartments();

        company.removeEmployeeFromDepartment("Engineering", "Bob");

        company.displayDepartments();
    }
}
