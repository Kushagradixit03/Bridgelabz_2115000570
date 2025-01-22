import java.util.*;
public class L_one_14{
 public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double height=sc.nextInt();
	double yard =  height/2.54;
	
	double mile =yard/12;

	System.out.println("Your Distance in feet "+height+" while in mile is "+mile+" and yards is "+yard);
 }
} 