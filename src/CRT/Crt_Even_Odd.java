package CRT;
import java.util.*;
import java.text.DecimalFormat; 

abstract class Crt_Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int ar[]=new int[n];
			for(int i=0;i<n;i++)
			{
				ar[i]=sc.nextInt();
				
			}
			Arrays.sort(ar);
			if(n%2!=0)
			{
				System.out.printf("%.2f",(double)ar[n/2]);
			}
			else
			{
				System.out.printf("%.2f",(double)((ar[n/2]+ar[n/2-1])/2.0));
			}
		}

	}

}
