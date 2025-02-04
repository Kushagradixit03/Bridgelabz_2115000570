public class Employee {
    static String companyName = "ABC";
    static int totalEmployees = 0;
    final int id;
    String name;
    String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Company: " + companyName);
    }

    public static void printEmployeeDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee emp = (Employee) obj;
            emp.displayEmployeeDetails();
        } else {
            System.out.println("Not an instance of the Employee class");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Kushagra", "Software Engineer");
        Employee emp2 = new Employee(2, "Aman", "Data Analyst");

        printEmployeeDetails(emp1);
        printEmployeeDetails(emp2);

        displayTotalEmployees();
    }
}
