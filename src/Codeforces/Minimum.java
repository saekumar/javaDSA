package Codeforces;
import java.util.*;
public class Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		System.out.println(check(ar,n,x,y));

	}

	public static int check(int[] ar, int n, int x, int y) {
		// TODO Auto-generated method stub
		int min=0,c=0,i=0;
		while(i<=n-x*y)
		{
			int j=i;
			int sum=0;
			while(j<i+x*y)
			{
				sum+=ar[j];
				j+=y;
			}
		    min = sum;
			min = Math.min(min,sum);
			i++;
		}

		
		
		return min;
		
	}

}
