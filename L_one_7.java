import static java.lang.Math.*;
public class L_one_7{
 public static void main(String args[]){
	int radius=6378;
	int volume =(int)( (4/3)*Math.PI*radius*radius*radius);
	System.out.println("The volume of earth in cubic kilometers is "+volume+" and cubic miles is "+volume*1.6);
	
	
 }
} 