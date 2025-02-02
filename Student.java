import java.util.*;

public class Student {
    
    public int rollNumber;    
    protected String name;      
    private double CGPA;        

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayStudentDetails() {
        System.out.println("Student Roll Number, Name and CGPA:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Name: " + name); 
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rollNumber = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter CGPA: ");
        double CGPA = sc.nextDouble();

        Student student1 = new Student(rollNumber, name, CGPA);

        student1.displayStudentDetails();

        PostgraduateStudent pgStudent = new PostgraduateStudent(rollNumber + 100, name + " PG", CGPA + 0.5);
        pgStudent.displayPostgraduateDetails();  	
    }
}
