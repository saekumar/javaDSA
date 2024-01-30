package Leetcodesums;
import java.util.*;

public class tribonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		tribon(n);
		System.out.println(tribon(n));

	}
	public static int tribon(int n)
	{
		int t0=0,t1=1,t2=1;
		if(n==0)
		{
			return t0;
		}
		else if (n==1)
		{
			return t1;
		}
		else if(n==2)
		{
			return t2;
		}
		else
		{
			return tribon(n-3)+tribon(n-2)+tribon(n-1);
		}
	}

}
//1389537
