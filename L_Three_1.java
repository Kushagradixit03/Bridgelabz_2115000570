import java.util.Random;
import java.util.Scanner;

public class L_Three_1 {

    private static int lowerBound = 1;
    private static int upperBound = 100;
    private static int guess;

    public static int generateGuess() {
        Random random = new Random();
        guess = lowerBound + random.nextInt(upperBound - lowerBound + 1);
        return guess;
    }

    public static String getFeedback() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is your number " + guess + "? (Enter 'high', 'low', or 'correct'): ");
        String feedback = scanner.nextLine().toLowerCase();
        return feedback;
    }

    public static void adjustBounds(String feedback) {
        if (feedback.equals("high")) {
            upperBound = guess - 1;
        } else if (feedback.equals("low")) {
            lowerBound = guess + 1;
        }
    }

    public static void playGame() {
        String feedback;
        do {
            guess = generateGuess();
            feedback = getFeedback();
            adjustBounds(feedback);
        } while (!feedback.equals("correct"));
        System.out.println("Yay! The computer guessed your number " + guess + " correctly!");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");
        playGame();
    }
}
