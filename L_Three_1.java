import java.util.Random;
public class L_Three_1 {
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            min = Math.min(min, height);
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            max = Math.max(max, height);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101);
        }
        System.out.println("Player Heights (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        System.out.println("\n\nResults:");
        System.out.println("Sum of Heights: " + sum);
        System.out.printf("Mean Height: %.2f cm\n", mean);
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
    }
}
