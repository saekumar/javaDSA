package DsaPrograms;

import java.util.Scanner;

public class PeakOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++)
   {
	   arr[i]=sc.nextInt();
   }
   int k=peak(n,arr);
		   
   
  
   
   System.out.println(k);
	}
	static int peak(int n,int a[])
	{
		int st=0,end=n-1,mid=0;
		while(st<=end)
		{
			mid=st+(end-st)/2;
			if(a[mid]>a[mid-1] && a[mid]>a[mid+1])
			{
				return a[mid];
			}
			else if(a[mid]<a[mid-1] && a[mid]>a[mid+1])
			{
				end=mid-1;
			}
			else
			{
				st=mid+1;
			}
			
		}
		return a[mid];
		
	}

}
