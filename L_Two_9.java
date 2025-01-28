import java.util.*;
public class L_Two_9 {
    public static boolean isPositive(int number) { return number >= 0; }
    public static String isEven(int number) { return (number % 2 == 0) ? "even" : "odd"; }
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sv.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is positive and ");
                System.out.println(isEven(numbers[i]) + ".");
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) System.out.println("First number is greater than the last number.");
        else if (result == 0) System.out.println("First number is equal to the last number.");
        else System.out.println("First number is less than the last number.");

    }
}
