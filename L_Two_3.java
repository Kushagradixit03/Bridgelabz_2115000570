import java.util.*;
public class L_Two_3{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int physics = sc.nextInt();
		int chemistry = sc.nextInt();
		int maths = sc.nextInt();
		int average=(physics+chemistry+maths)/3;
		if(average>=80){
			
			System.out.println("A  (Level 4, above agency-normalized standards) "+average);
		}
		else if(average<80&&average>=70){
			
			System.out.println("B  (Level 3, at agency-normalized standards) "+average);
		}
		else if(average<70&&average>=60){
			
			System.out.println("c  (Level 2, below, but approaching agency-normalized standards) "+average);
		}
		else if(average<60&&average>=50){
			
			System.out.println("D  (Level 1, wil below agency-normalized standards) "+average);
		}
		else if(average<50&&average>=40){
			
			System.out.println("E  (Level 1-,too below agency-normalized standards) "+average);
		}
		else{
		System.out.println("R (Remedial Standards)"+average);
		}
		
	}
}