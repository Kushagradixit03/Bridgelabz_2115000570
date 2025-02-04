public class Patient {
    static String hospitalName = "Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }

    public void displayPatientDetails() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Hospital: " + hospitalName);
    }

    public static void processPatientDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient patient = (Patient) obj;
            patient.displayPatientDetails();
        } else {
            System.out.println("Not an instance of the Patient class.");
        }
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient(1, "Aman", 45, "Fever");
        Patient patient2 = new Patient(2, "Rohan", 30, "Cold");

        processPatientDetails(patient1);
        processPatientDetails(patient2);

        getTotalPatients();

        Patient patient3 = new Patient(3, "Sam ", 60, "Cold");
        processPatientDetails(patient3);

        getTotalPatients();
    }
}
	