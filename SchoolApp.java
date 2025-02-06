import java.util.ArrayList;
import java.util.List;

class Course {
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.enrollInCourse(this);
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + this.name + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }

    public String getName() {
        return this.name;
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void viewCourses() {
        System.out.println(this.name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getName());
        }
    }

    public String getName() {
        return this.name;
    }
}

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void showStudents() {
        System.out.println("Students at " + this.name + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

public class SchoolApp {
    public static void main(String[] args) {
        School school = new School("Green Valley High School");

        Student student1 = new Student("Aman");
        Student student2 = new Student("Rohan");
        Student student3 = new Student("Sunil");

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        Course course1 = new Course("Math");
        Course course2 = new Course("Science");
        Course course3 = new Course("History");

        course1.enrollStudent(student1);
        course1.enrollStudent(student2);

        course2.enrollStudent(student2);
        course2.enrollStudent(student3);

        course3.enrollStudent(student1);
        course3.enrollStudent(student3);

        course1.showEnrolledStudents();
        course2.showEnrolledStudents();
        course3.showEnrolledStudents();

        student1.viewCourses();
        student2.viewCourses();
        student3.viewCourses();

        school.showStudents();
    }
}
