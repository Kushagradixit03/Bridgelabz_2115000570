import java.util.Random;

public class L_Two_12 {

    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + random.nextInt(9000); // Generate a random 4-digit number (1000 to 9999)
        }
        return randomNumbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);

        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }

        double[] results = findAverageMinMax(randomNumbers);
        double average = results[0];
        int min = (int) results[1];
        int max = (int) results[2];

        System.out.printf("\nAverage: %.2f\n", average);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
