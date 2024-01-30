package CRT;
import java.util.*;
public class Crt_Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n-1];
		for (int i = 0; i < n-1; i++) {
			arr[i]=sc.nextInt();
			
		}
		 //System.out.println(search1(arr,n));
		 System.out.println(search2(arr,n));

	}
	static int search1(int a[],int n)
	{
	   int ht[]=new int[n+1];
	   for (int i = 0; i < ht.length; i++) {
		   ht[i]=0;
		
	}
	   for (int i = 0; i < n-1; i++) {
		   ht[a[i]]=1;
		   
		
	}
	   for (int i = 1; i < ht.length; i++) {
		   if(ht[i]!=1)
		   {
			   return i;
		   }
		
	}
	   return 0;
	}
	static int search2(int a[],int n)
	{
		int s=0,s1=n*(n+1)/2;
		for (int i = 0; i < n-1; i++) {
			s+=a[i];
			
		}
		return s1-s;
	}

}
