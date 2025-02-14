import java.util.*;
public class InsertionSort {
    public static void insertionSort(int[] arr,int n) {
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
        int[] employeeIds = new int[n];
		for(int i=0;i<n;i++){
			employeeIds[i]=sc.nextInt();
		}
        insertionSort(employeeIds,n);
        System.out.println("Sorted Employee IDs:");
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
    }
}
