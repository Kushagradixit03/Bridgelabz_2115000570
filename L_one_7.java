import java.util.*;
public class L_one_7{
	public static void sum(int num){
		int sum = 0;
		while(num>0){
			sum = sum+num;
			num--;
			
		}
		System.out.println("The sum of " + num+" natural numbers "+sum);
	} 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sum(num);
		
		
	}
}