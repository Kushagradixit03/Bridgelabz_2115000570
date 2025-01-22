import java.util.*; 
public class L_one_9{
 public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int fee = sc.nextInt();
	int discountPercentage=sc.nextInt();
	int discount=fee/discountPercentage;
	int amount=fee-discount;
	
	System.out.println("The discount amount is INR "+discount+ " and final discounted fee is INR "+amount);
	
	
 }
} 