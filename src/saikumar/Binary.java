package saikumar;
import java.util.*;
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[n];
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		
		int sai=binary(a,t);
		if(sai==-1)
		{
			System.out.println("NOT FOUND");
		}
		else
		{
		
			System.out.println("ELEMENT FOUND AT INDEX "+sai);
		}
		
		
		
	
		

	}
	static int binary(int a[],int t)
	{
		 ArrayList<Integer> cl = new ArrayList<>();
	   for(int j:a)
	   {
		   cl.add(j);
	   }
	Arrays.sort(a);
	int st=0,end=a.length-1;
		
		
		while(st<=end)
		{
			int mid=st+((end-st)/2);
			if(t==a[mid])
			{
				
			return cl.indexOf(t);
				
			}
			else if(t>a[mid])
			{
				st=mid+1;
			}
			else if(t<a[mid])
			{
				end=mid-1;
			}
			
		}
		return -1;
	}
	
	
	
	
	//time complexity k=log(n)base2.//k=worst case level

}
