import java.util.*;
public class Self_Problems1{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int principal = sc.nextInt();
		int rate = sc.nextInt();
		int time = sc.nextInt();
		int simple_interest	= (principal*rate*time)/100;
		System.out.println("The Simple Interest is "+simple_interest);
		
	}
}