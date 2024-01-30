package Leetcodesums;
//https://www.hackerrank.com/contests/daa-skill-7/challenges/an-interesting-game-1
import java.util.*;

public class Daaskill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			int ar[]=new int[n];
			for (int i = 0; i < n; i++) {
				ar[i]=sc.nextInt();
				arr[i]=ar[i];
			}
		System.out.println(gamingarray(ar,arr,n));
		}

	}
	public static String gamingarray(int ar[],int arr[],int n)
	{
		Arrays.sort(ar);
		int j=n-1,c=0;
		int max=ar[j];
		
		for (int i = 0; i < n; i++) {
			if(max==arr[i])
			{
				
				gamingarray(ar,arr,i);
				max=ar[j--];
				c++;
			}
		}
		if(c%2!=0)
		{
			return "BOB";
		}
		else
		{
			return "ANDY";
		}
	}

}
