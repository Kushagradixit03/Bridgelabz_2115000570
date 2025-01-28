import java.util.*;
public class L_Two_8 {
    public static int findYoungest(int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }
    public static int findTallest(double[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + friends[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);
        System.out.println(friends[youngestIndex] + " is the youngest with age " + ages[youngestIndex] + " years.");
        System.out.println(friends[tallestIndex] + " is the tallest with height " + heights[tallestIndex] + " cm.");

    }
}
