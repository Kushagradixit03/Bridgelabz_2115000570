import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int[] arr,int n) {
     
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; 
        }
    }

    public static void main(String[] args) {
		Scanner sc= new scanner(System.in);
		int n= sc.nextInt();
        int[] studentMarks = new int[n];
		for(int i=0;i<n;i++){
			studentMarks[i]=sc.nextInt();
		}
        bubbleSort(studentMarks,n);
        System.out.println("Sorted Student Marks:");
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }
    }
}
