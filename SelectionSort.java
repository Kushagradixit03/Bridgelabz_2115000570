import java.util.*;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of exam scores: ");
        int n = sc.nextInt();
        int[] examScores = new int[n];

        System.out.println("Enter exam scores:");
        for (int i = 0; i < n; i++) {
            examScores[i] = sc.nextInt();
        }

        selectionSort(examScores);
        System.out.println("Sorted Exam Scores:");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}
