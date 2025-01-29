import java.util.Scanner;

public class L_Three_7 {

    public static int getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    public static void displayResults(int gcd, int lcm) {
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    public static void main(String[] args) {
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);
        
        displayResults(gcd, lcm);
    }
}
