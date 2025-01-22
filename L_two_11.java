import java.util.*; 
public class L_two_11{
 public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int Principal=sc.nextInt();
	int Rate =sc.nextInt();
	int Time = sc.nextInt();
	int Simple_Interest = Principal * Rate * Time / 100;

	
	
	System.out.println("The Simple Interest is "+Simple_Interest+ " for Principal " +Principal+", "+ "Rate of Interest "+Rate +" and Time " +Time);
	
	
 }
}  