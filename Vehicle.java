public class Vehicle {
    static double registrationFee = 150.0;

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }

    public void displayRegistrationDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void processVehicleDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) obj;
            vehicle.displayRegistrationDetails();
        } else {
            System.out.println("Not an instance of the Vehicle class.");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("123", "Kushagra", "Car");
        Vehicle vehicle2 = new Vehicle("456", "Aman", "Car");

        processVehicleDetails(vehicle1);
        processVehicleDetails(vehicle2);

        updateRegistrationFee(200.0);

        System.out.println("Updated Vehicle Registration Details:");
        processVehicleDetails(vehicle1);
        processVehicleDetails(vehicle2);
    }
}
