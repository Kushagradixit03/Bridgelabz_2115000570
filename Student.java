public class Student {
    static String universityName = "GLA University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    String grade;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("University: " + universityName);
    }

    public void updateGrade(String newGrade) {
        grade = newGrade;
        System.out.println("Grade updated to: " + grade);
    }

    public static void processStudentDetails(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            student.displayStudentDetails();
        } else {
            System.out.println("Not an instance of the Student class");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Kushagra", "A");
        Student student2 = new Student(2, "Rohan", "B");

        processStudentDetails(student1);
        processStudentDetails(student2);

        displayTotalStudents();

        student1.updateGrade("A+");
        student2.updateGrade("B+");

        System.out.println("Updated Student Details:");
        processStudentDetails(student1);
        processStudentDetails(student2);

        displayTotalStudents();
    }
}
