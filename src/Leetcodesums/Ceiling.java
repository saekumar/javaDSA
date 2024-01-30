package Leetcodesums;
//find the smallest in array which is greater than or equal to terget.
import java.util.*;

import saikumar.Arraylist;
public class Ceiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
         
          
          int a[]=new int[n];
          for (int i = 0; i < n; i++) {
    			a[i]=sc.nextInt();
    		}
          int tar=sc.nextInt();
          int k=ceilnmbr(a,tar);
          System.out.println(""+a[k]);
         
          
        		  
	}
	static int ceilnmbr(int a[],int tar)
	{
		int st=0,end=a.length-1;

		while(st<=end)
		{
			int mid=(st+((end-st)/2));
			if(tar==a[mid])
			{
				return mid;
			}
			else if(tar>a[mid])
			{
				st=mid+1;
			}
			else if (tar<a[mid])
			{
				end=mid-1;
			}
			
		}
		return st;
		
	}

}
