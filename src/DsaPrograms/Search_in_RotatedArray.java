package DsaPrograms;

import java.util.Scanner;

public class Search_in_RotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		   int n=sc.nextInt();
		   int tar=sc.nextInt();
		   int arr[]=new int[n];
		   for(int i=0;i<n;i++)
		   {
			   arr[i]=sc.nextInt();
		   }
		   int k=rotate(n,arr,tar);
//		   int k=pivot_index(n, arr);
				   
		   
		  
		   
		   System.out.println(k);

	
	
       }
	
	static int rotate(int n,int a[],int tar)
	{
		int z;
		int k=pivot_index(n,a);
		if(a[k]==tar)
		{
			z= k;
		}
		else if(tar>a[0])
		{
			z= binary(n,a,tar,0,k-1);
		}
		else
		{
			z= binary(n,a,tar,k+1,n-1);
		}
		return z;
		
			

	}
	
	static int pivot_index(int n,int a[])
	{
		int st=0,end=n-1,mid=0;
		while(st<=end)
		{
			mid=st+(end-st)/2;
			if(mid>st &&  a[mid]<a[mid-1])
			{
				return mid-1;
			}
			else if(mid<end &&a[mid]>a[mid+1])
			{
				return mid;
			}
			else if(a[st]>=a[mid])
			{
				end=mid-1;
			}
			else
			{
				st=mid+1;
			}
			
		}
		return -1;
		
	}
static int binary(int n,int a[],int tar,int st,int end)
{
	int mid=0;
	while(st<=end)
	{
		mid=st+(end-st)/2;
		if(a[mid]==tar)
		{
			return mid;
		}
		else if(tar<a[mid])
		{
			end=mid-1;
		}
		else
		{
			st=mid+1;
		}
		
	}
	return -1;
	
}
	
}
