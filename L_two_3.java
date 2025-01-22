import java.util.*; 
public class L_two_3{
 public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double a=sc.nextInt();
	double b=sc.nextInt();
	double c=sc.nextInt();
	double d = a + b *c;
	double e = a * b + c;
	double f = c + a / b;
	double g = a % b + c;

	
	
	System.out.println(" The results of Int Operations are " +d +", "+e+", "+f +" and "+g);
	
 }
}  