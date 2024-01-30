package Leetcodesums;
//https://www.codechef.com/problems/TRICOIN
import java.util.*;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int n=sc.nextInt();
		int x=(int)(Math.sqrt(1+8*n)-1)/2;
		System.out.println(x);
		Approach2(n);
		}
		

	}
	static void Approach2(int n)

	{
		int s=0;
		for (int i = 1; i <=n; i++) {
			s+=i;
			if(s==n)
			{
				System.out.println(i);
				break;
			}
			else if(s>n)
			{
				System.out.println(i-1);
	               break;
			}
			
		}
	}
}
