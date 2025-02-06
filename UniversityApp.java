import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Department {
    private String name;
    private List<Faculty> facultyMembers;

    public Department(String name) {
        this.name = name;
        this.facultyMembers = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        if (!facultyMembers.contains(faculty)) {
            facultyMembers.add(faculty);
        }
    }

    public void removeFaculty(Faculty faculty) {
        facultyMembers.remove(faculty);
    }

    public void showFaculty() {
        System.out.println("Faculty in " + this.name + " Department:");
        for (Faculty faculty : facultyMembers) {
            System.out.println("- " + faculty.getName());
        }
    }

    public String getName() {
        return this.name;
    }
}

class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        if (!departments.contains(department)) {
            departments.add(department);
        }
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    public void showDepartments() {
        System.out.println("Departments at " + this.name + ":");
        for (Department department : departments) {
            System.out.println("- " + department.getName());
        }
    }

    public void deleteUniversity() {
        departments.clear();
        System.out.println("The university " + this.name + " and all its departments have been deleted.");
    }
}

public class UniversityApp {
    public static void main(String[] args) {
        University university = new University("Tech University");

        Department csDepartment = new Department("Computer Science");
        Department eeDepartment = new Department("Electrical Engineering");

        Faculty faculty1 = new Faculty("Dr. Aman");
        Faculty faculty2 = new Faculty("Dr. Rohan");
        Faculty faculty3 = new Faculty("Dr. Sunil");

        university.addDepartment(csDepartment);
        university.addDepartment(eeDepartment);

        csDepartment.addFaculty(faculty1);
        csDepartment.addFaculty(faculty2);

        eeDepartment.addFaculty(faculty2);
        eeDepartment.addFaculty(faculty3);

        university.showDepartments();
        csDepartment.showFaculty();
        eeDepartment.showFaculty();

        university.deleteUniversity();

        university.showDepartments();
    }
}
