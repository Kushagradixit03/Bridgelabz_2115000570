import java.util.Scanner;

public class L_Three_6 {

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    public static int calculateFactorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * calculateFactorial(number - 1); 
    }

    public static void displayResult(int factorial) {
        System.out.println("The factorial is: " + factorial);
    }

    public static void main(String[] args) {
        int number = getInput();
        int factorial = calculateFactorial(number);
        displayResult(factorial);
    }
}
