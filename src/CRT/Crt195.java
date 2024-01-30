package CRT;
//Wap to print len,boundaries of longest sub-array which contains only 1's nmbrs...
//constraint :
//0<n<=10^5
//-10^10<a[ele]<10^10
//i/p: 11
//1 1 0 2 1 1 1 1 0 3 1 1 1
//O/P: 4----->len
//4 7----->boundaries
import java.util.*;

public class Crt195 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		//kadane(n, arr);
		kadane2(n,arr);
		

	}
	static void kadane(int n,int a[])
	{
		int glo=Integer.MIN_VALUE,loc=0,s=0,k=0,ns=0,len=0;
		for (int i = 0; i < n; i++) {
			
			if(a[i]!=1)
			{
				if(len<i-ns)
				{
					s=ns;k=i;len=i-ns;
					
				}
				ns=i+1;
			}
		}
		System.out.println(k-s);
		System.out.println(s+ " "+(k-1));
		
	}
	static void kadane2(int n,int a[])
	{
		int glo=Integer.MIN_VALUE,loc=0,s=0,k=0,ns=0,len=0;
		for (int i = 0; i < n-1; i++) {
			
			if(a[i+1]<=a[i])
			{
				if(len<i-ns)
				{
					s=ns;k=i;len=i-ns;
					
				}
				ns=i+1;
			}
		}
		System.out.println(k-s+1);
		System.out.println(s+ " "+(k));
		
	}

}
