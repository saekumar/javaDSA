package DsaPrograms;
//given an array and target value.we have to find ceil of particular target in given array
import java.util.*;
public class CeilOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int n=6;
   char tar='z';
   char arr[]= {'a','c','h','k','m','n'};
  
   char k=Ceil(n,tar,arr);
   System.out.println(k);
	}
	public static char Ceil(int n,int tar,char arr[])
	{
		int st=0,end=n-1;
		int mid=0;
		 
		while(st<=end)
		{
			mid=st+(end-st)/2;
			 if(tar<arr[mid])
			{
				end=mid-1;
			}
			else
			{
				st=mid=1;
			}
					
		}
		return arr[st%n];
				
	}

}
