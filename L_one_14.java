import java.util.*;
public class L_one_14{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;
		int fact = 1;
		while(n>0){
			fact=fact*n;
			n--;
		}
		System.out.println("Factorail of a number "+num+ " is "+fact);
	}
}