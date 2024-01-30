package saikumar;
import java.util.*;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int tar=s.nextInt();
		System.out.println(""+linearsearch(arr,tar));
		System.out.println(""+linear2d());
		
		

	}
	static int linearsearch(int arr[],int tar)
	{
		if(arr.length==0)
		{
			return -1;
		}
		else {
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==tar)
				{
					return i;
				}
			}
		}
		return -1;
	}
	static String linear2d()
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int t=sc.nextInt();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if(a[i][j]==t)
				{
					return "YES";
				}
				
			}
			
		}
		return "no";
		
	}

}
