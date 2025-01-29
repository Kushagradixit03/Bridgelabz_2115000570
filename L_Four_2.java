import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class L_Four_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        LocalDate date = LocalDate.parse(inputDate, formatter);
        
        LocalDate newDate = date.plusDays(7)
                                .plusMonths(1)
                                .plusYears(2);
        
        newDate = newDate.minusWeeks(3);
        
        System.out.println("Original Date: " + date);
        System.out.println("New Date after adding 7 days, 1 month, and 2 years, then subtracting 3 weeks: " + newDate);
        
    }
}
