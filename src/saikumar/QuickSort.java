package saikumar;
import java.util.*;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int ar[]=new int[n];
       for (int i = 0; i < n; i++) {
    	   ar[i]=sc.nextInt();
		
	}
       QuickSort q1=new QuickSort();
       q1.Quick(ar,0,n-1);
      
      for (int i = 0; i < ar.length; i++) {
		System.out.print(ar[i]+" ");
	}
	}
	 void Quick(int a[],int l,int h)
	{
		
		if(l<h)
		{
			int j=partition(a,l,h);
			Quick(a, l, j-1);
			Quick(a, j+1, h);
		}
		
		
		
	}
	 int partition(int a[],int l,int h)
	{
		int pi=a[l],i=l,j=h;
		
		while(i<j)
		{
		do {
			i++;
		}
		while(a[i]<=pi);
		do {
			j--;
		}
		while(a[j]>pi);
		if(i<j)
		{
			int te=a[i];
			a[i]=a[j];
			a[j]=te;
		}
		}
		int te=a[l];
		a[l]=a[j];
		a[j]=te;
		
		return j;
		
	}
	
	

}
