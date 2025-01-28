import java.util.Random;
import java.util.*;
public class StudentScoreCard {
    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        Random random = new Random();
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(90) + 10;
            scores[i][1] = random.nextInt(90) + 10;
            scores[i][2] = random.nextInt(90) + 10;
        }
        return scores;
    }
	public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        double[][] results = new double[scores.length][4];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
	public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\t%d\t%.2f\t\t%.2f\n", i + 1, scores[i][0], scores[i][1], scores[i][2], 
            (int) results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int[][] scores = generateRandomScores(numStudents);
        double[][] results = calculateTotalAveragePercentage(scores);
        displayScoreCard(scores, results);
       
    }
}
