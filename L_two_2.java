import java.util.*; 
public class L_two_2{
 public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d = a + b *c;
	int e = a * b + c;
	int f = c + a / b;
	int g = a % b + c;

	
	
	System.out.println(" The results of Int Operations are " +d +", "+e+", "+f +" and "+g);
	
 }
}  