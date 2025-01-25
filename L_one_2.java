import java.util.*;
public class L_one_2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0;i<5;i++){
			arr[i] = sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				System.out.println("Print Zero");
			}
			else if(arr[i]>0){
				if(arr[i]%2==0){
				System.out.println("The num "+arr[i]+" is positive and even");
				}
				else{
					System.out.println("The num "+arr[i]+" is positive and odd");
				}
			}
			else{
				System.out.println("Print Negative");
			}
			
		}
			if(arr[0]==arr[arr.length-1]){
				System.out.println("Both numbers are equal");
			}
			else if(arr[0]>arr[arr.length-1]){
				
				System.out.println("First element is greater than second");
				
				
			}
			else{
				System.out.println("Second element is greater than first");
			}
		
	}
}