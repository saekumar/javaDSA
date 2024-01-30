package DsaPrograms;
import java.util.*;
public class FirstAndLastOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]= {4,7,7,7,7,7,8,8,8,10};
   int arr2[]= {2,6,7,8,12,16,18,21,25,29,31,38,47,49,56,78};
   int tar2=21;
   int tar=7;
//   int k[]=Binary(arr,tar);
   int f=Infinite_array(arr2,tar2);
//   System.out.println(Arrays.toString(k));
   System.out.println(f);
   
	}
	public static int[] Binary(int arr[],int tar)
	{
		int a[]= {-1,-1};
		 a[0]=search(arr,tar,true);
		a[1]=search(arr,tar,false);
		return a;
	}
	public static int search(int arr[],int tar,boolean exp)
	{
		int st=0,end=arr.length-1,mid=0;
		int ans=0;
		while(st<=end)
		{
			mid=st+(end-st)/2;
			if(arr[mid]<tar)
			{
				st=mid+1;
			}
			else if(arr[mid]>tar)
			{
				end=mid-1;
			}
			else
			{
				ans=mid;
				if(exp)
				{
					end=mid-1;
				}
				else
				{
					st=mid+1;
				}
			}
		}
		return ans;
	}
	
	
	public static int Infinite_array(int a[],int tar)
	{
		int st=0,end=1;
		while(tar>a[end])
		{
			int temp=end+1;
			end+=2*(end-st+1);
			st=temp;
		}
		return search_infinite(st,end,a,tar);
	}
	public static int  search_infinite(int st,int end,int a[],int tar)
	{
		int mid=0;
		
		while(st<=end)
		{
			mid=st+(end-st)/2;
			if(a[mid]<tar)
			{
				st=mid+1;
			}
			else if(a[mid]>tar)
			{
				end=mid-1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}

}
