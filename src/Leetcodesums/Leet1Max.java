package Leetcodesums;
import java.util.*;

public class Leet1Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for (int i = 0; i < n; i++) {
		      ar[i]=sc.nextInt();
			
		}
		int st=0,end=n-1;
		
		while(st<end)
		{
			int mid=(st+end)/2;
			if(ar[mid]<ar[mid+1])
			{
				st=mid+1;
			}
			else
			{
				end=mid;
			}
		}
		System.out.println(""+st);
		

	}

}
