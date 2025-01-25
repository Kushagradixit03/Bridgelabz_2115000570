import java.util.*;
public class L_Two_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
		int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;
		while (number != 0 && index < maxDigits) {
            digits[index] = number % 10; 
            number = number / 10;        
            index++;
        }
		int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest digit.");
        } else {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        }
    }
}
