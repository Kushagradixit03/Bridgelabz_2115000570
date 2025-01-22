import java.util.*;
public class L_one_10{
 public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double height=sc.nextInt();
	double inch =  height/2.54;
	
	double foot =inch/12;

	System.out.println("Your Height in cm is "+height+" while in feet is "+foot+" and inches is "+inch);
 }
} 