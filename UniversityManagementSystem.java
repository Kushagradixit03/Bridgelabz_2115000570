import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private List<Student> enrolledStudents;
    private List<Professor> assignedProfessors;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
        this.assignedProfessors = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public void addProfessor(Professor professor) {
        if (!assignedProfessors.contains(professor)) {
            assignedProfessors.add(professor);
        }
    }

    public void showCourseDetails() {
        System.out.println("Course: " + this.courseName);
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
        System.out.println("Assigned Professors:");
        for (Professor professor : assignedProfessors) {
            System.out.println("- " + professor.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
            System.out.println(this.name + " has enrolled in " + course.getCourseName());
        }
    }

    public void showCourses() {
        System.out.println(this.name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

class Professor {
    private String name;
    private List<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addProfessor(this);
            System.out.println(this.name + " is assigned to teach " + course.getCourseName());
        }
    }

    public void showCourses() {
        System.out.println(this.name + " is teaching the following courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Dr. Kushagra");
        Professor professor2 = new Professor("Dr. Rohan");

        Student student1 = new Student("Aman");
        Student student2 = new Student("Sunil");

        Course course1 = new Course("Computer Science 101");
        Course course2 = new Course("Data Structures");

        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student1.enrollCourse(course2);

        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        course1.showCourseDetails();
        course2.showCourseDetails();

        student1.showCourses();
        student2.showCourses();
        professor1.showCourses();
        professor2.showCourses();
    }
}
