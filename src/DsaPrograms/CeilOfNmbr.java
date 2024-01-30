package DsaPrograms;
//given an array and target value.we have to find ceil of particular target in given array
import java.util.*;

public class CeilOfNmbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int tar=sc.nextInt();
     int arr[]=new int[n];
     for (int i = 0; i < n; i++) {
    	 arr[i]=sc.nextInt();
		
	}
     Ceil(n,tar,arr);
     System.out.println(Ceil(n,tar,arr));
     Floor(n,tar,arr);
	}
	public static int Ceil(int n,int tar,int arr[])
	{
		int st=0,end=n-1;
		int mid=0;
		while(st<=end)
		{
			mid=st+(end-st)/2;
			if(tar==arr[mid])
			{
				return tar;
			}
			else if(tar<arr[mid])
			{
				end=mid-1;
			}
			else
			{
				st=mid+1;
			}
		}
		return arr[st];
	}
	public static int Floor(int n,int tar,int arr[])
	{
		int st=0,end=n-1;
		int mid=0;
		while(st<=end)
		{
			mid=st+(end-st)/2;
			if(tar==arr[mid])
			{
				return tar;
			}
			else if(tar<arr[mid])
			{
				end=mid-1;
			}
			else
			{
				st=mid+1;
			}
		}
		return arr[st-1];
	}

}
