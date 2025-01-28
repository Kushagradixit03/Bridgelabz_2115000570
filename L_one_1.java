import java.util.*;
public class L_one_1{
	public static void simpleInterest(int Principal, int Rate, int Time){
		int simple_interest = (Principal*Rate*Time)/ 100;
		System.out.println("The Simple Interest is "+simple_interest+"  for Principal "+Principal+", Rate of Interest "+Rate+" and Time "+Time);
	} 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int Principal = sc.nextInt();
		int Rate = sc.nextInt();
		int Time = sc.nextInt();
		simpleInterest(Principal, Rate, Time);
	}
}