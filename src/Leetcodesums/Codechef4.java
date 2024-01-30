//https://www.codechef.com/START76D/problems/ZEROSTRING
package Leetcodesums;
import java.util.*;

public class Codechef4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int c=0,k=0;
			int n=sc.nextInt();
			String s=sc.next();
			sc.nextLine();
			
			for (int i = 0; i <s.length(); i++) {
				if(s.charAt(i)==48)
				{
					c++;
				}
				else if(s.charAt(i)==49)
				{
					k++;
				}
				if(k<=c)
				{
					System.out.println(k);
				}
				else
				{
					System.out.println(c+1);
				}
				
			}
			
		}

	}

}
