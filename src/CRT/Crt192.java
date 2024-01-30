package CRT;
import java.util.*;

public class Crt192 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(bruteforce(n,arr));
		//System.out.println(kadane(n, arr));
		

	}
	static int bruteforce(int n,int a[])
	{
		int glo=Integer.MIN_VALUE,loc,k=0,s=0;
		for (int i = 0; i < n; i++) {
			loc=0;
			for (int j = i; j < n; j++) {
				loc+=a[j];
				if(loc>=glo)
				{
					glo=loc;
					k=j;
					s=i;
				}
				
			}
			
		}
		System.out.println((k-s+1)+"\n "+s+ " "+k);
		return glo; 
	}
	static int kadane(int n,int a[])
	{
		int glo=Integer.MIN_VALUE,loc=0;
		for (int i = 0; i < n; i++) {
			loc+=a[i];
			if(loc>=glo)
			{
				glo=loc;
			}
			else if(loc<0)
			{
				loc=0;
			}
			
		}
		return glo;
	}

}
