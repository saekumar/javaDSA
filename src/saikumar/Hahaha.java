package saikumar;
import java.util.*;

public class Hahaha {

	public static <a> void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Max nmbr of given array is: "+max(arr));
		for(int i=0;i<n/2;i++)
		{
			int te=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-1-i]=te;
			
		}
		System.out.println(Arrays.toString(arr));
	}
	static int max(int arr[])
	{
		int maxi=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>maxi)
			{
				maxi=arr[i];
			}
		}
		return maxi;
	}

}



		

