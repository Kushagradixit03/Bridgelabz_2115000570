import java.util.*; 
public class L_two_10{
 public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int numberOfchocolates=sc.nextInt();
	int numberOfChildren=sc.nextInt();
	int Quotient = numberOfchocolates/numberOfChildren;
	double remainder = numberOfchocolates%numberOfChildren;
	
	
	System.out.println("The number of chocolates each child gets is " +Quotient+ " and the number of remaining chocolates are "+remainder);
	
	
 }
}  