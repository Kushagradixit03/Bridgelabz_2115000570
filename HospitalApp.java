import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void showDoctors() {
        System.out.println(this.name + " has consulted with the following doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.getName());
        }
    }
}

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public void consult(Patient patient) {
        System.out.println(this.name + " is consulting with " + patient.getName());
        // Communication during the consultation
        System.out.println(this.name + ": " + "Hello " + patient.getName() + ", how are you feeling today?");
        System.out.println(patient.getName() + ": " + "I have a mild headache.");
        System.out.println(this.name + ": " + "It seems like you have a common cold. ");
    }

    public void showPatients() {
        System.out.println(this.name + " has consulted with the following patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public void showDoctorsAndPatients() {
        System.out.println("Doctors at " + this.name + ":");
        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.getName());
        }
        System.out.println("Patients at " + this.name + ":");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor doctor1 = new Doctor("Dr. Thomas");
        Doctor doctor2 = new Doctor("Dr. Rohan");

        Patient patient1 = new Patient("Kushagra");
        Patient patient2 = new Patient("Sunil");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);

        doctor2.addPatient(patient1);

        patient1.addDoctor(doctor1);
        patient1.addDoctor(doctor2);
        patient2.addDoctor(doctor1);

        hospital.showDoctorsAndPatients();

        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        patient1.showDoctors();
        patient2.showDoctors();

        doctor1.showPatients();
        doctor2.showPatients();
    }
}
