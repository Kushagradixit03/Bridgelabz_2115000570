import java.util.*;
public class L_one_10{
	public static int[] findRemainderAndQuotient(int noOfChocolates, int noOfchildren)  {
		int ans[] = new int[2];
		ans[0] = noOfChocolates/noOfchildren;
		ans[1] = noOfChocolates%noOfchildren;
		return ans;
	} 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int noOfChocolates = sc.nextInt();
		int noOfchildren = sc.nextInt();
		int ans[]=findRemainderAndQuotient(noOfChocolates,noOfchildren);
		for(int i=0;i<ans.length;i++){
			System.out.println(ans[i]);
		}
		
	}
}


