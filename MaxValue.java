import java.util.Scanner;

public class L_Three_2 {

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        
        System.out.print("Enter the first number: ");
        numbers[0] = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        numbers[1] = sc.nextInt();
        
        System.out.print("Enter the third number: ");
        numbers[2] = sc.nextInt();
        
        return numbers;
    }

    public static int findMaximum(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = takeInput();
        int max = findMaximum(numbers);
        
        System.out.println("The maximum value is: " + max);
    }
}
