import java.util.*;
public class L_two_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        
        String fromCity = sc.nextLine();
        
        String viaCity = sc.nextLine();
        
        String toCity = sc.nextLine();
        
        double fromToVia = sc.nextDouble();
        
        double viaToFinalCity = sc.nextDouble();
        
        int hoursFromToVia = sc.nextInt();
        
        int minutesFromToVia = sc.nextInt();
        
        int hoursViaToFinalCity = sc.nextInt();
        
        int minutesViaToFinalCity = sc.nextInt();
        
        double totalDistance = fromToVia + viaToFinalCity;
        
        int totalHours = hoursFromToVia + hoursViaToFinalCity;
        int totalMinutes = minutesFromToVia + minutesViaToFinalCity;
        
        if (totalMinutes >= 60) {
            totalMinutes -= 60;
            totalHours += 1;
        }
        
        System.out.println("\nTravel Summary for " + name + ":");
        System.out.println("Total Distance from " + fromCity + " to " + toCity + ": " + totalDistance + " miles");
        System.out.println("Total Time: " + totalHours + " hours and " + totalMinutes + " minutes");

        double fee = sc.nextDouble();
        
        double discountPercent = sc.nextDouble();
        
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        
        System.out.println("\nThe results of Int Operations are fee: " + fee + ", discount: " + discount + " and final fee: " + finalFee);
        
    }
}

