class StudentNode {
    int rollNumber;
    String name;
    int age;
    String grade;
    StudentNode next;

    public StudentNode(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentList {
    private StudentNode head;

    public StudentList() {
        head = null;
    }

    public void addStudentAtBeginning(int rollNumber, String name, int age, String grade) {
        StudentNode newStudent = new StudentNode(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    public void addStudentAtEnd(int rollNumber, String name, int age, String grade) {
        StudentNode newStudent = new StudentNode(rollNumber, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    public void deleteStudentByRollNumber(int rollNumber) {
        if (head == null) return;
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public StudentNode searchStudentByRollNumber(int rollNumber) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void displayStudents() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    public void updateStudentGrade(int rollNumber, String newGrade) {
        StudentNode student = searchStudentByRollNumber(rollNumber);
        if (student != null) {
            student.grade = newGrade;
        }
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.addStudentAtEnd(1, "Alice", 20, "A");
        studentList.addStudentAtEnd(2, "Bob", 21, "B");

        studentList.displayStudents();

        studentList.updateStudentGrade(2, "A+");
        System.out.println("Updated Student List:");
        studentList.displayStudents();

        studentList.deleteStudentByRollNumber(1);
        System.out.println("After Deletion:");
        studentList.displayStudents();
    }
}
