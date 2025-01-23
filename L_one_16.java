import java.util.*;
public class L_one_16{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		
		while(i!=n){
			if(i%2==0){
			System.out.println("It is even");
			}
			else{
			
			System.out.println("It is odd");
			}
			i++;
		}
	}
}