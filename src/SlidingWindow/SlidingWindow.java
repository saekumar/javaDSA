package SlidingWindow;
import java.util.*;
public class SlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=3;
		int ar[]=new int[n];
		
		for (int i = 0; i < n; i++) {
			ar[i]=sc.nextInt();
		}
		check(n,k,ar);

	}
	public static void check(int n,int k,int ar[])
	{
		int arr[]=new int[n-k+1];
		int st=1,end=k;
		int sum=ar[0]+ar[1]+ar[2];
		arr[0]=sum;
		
		while(end<n)
		{
			sum=sum-ar[st-1]+ar[end];
//			System.out.println(sum);
		
			arr[st]=sum;
			st++;
			end++;
				
			
		}
		
		for(int i=0;i<n-k+1;i++)
		{
			System.out.println(arr[i]);
			
		}
	}

}
