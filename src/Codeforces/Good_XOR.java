package Codeforces;
import java.util.*;
public class Good_XOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int z=0,c=0;
			int arr[]=new int[n];
			for (int i = 0; i < n; i++) {
				arr[i]=sc.nextInt();
				if(arr[i]==0)
				{
					z++;
				}
				else
				{
					c++;
				}
				
			}
			if(n==1)
			{
				System.out.println("-1");
			}
			else if(n%2!=0)
			{
				System.out.println("-1");
			}
			else if(z>c)
			{
				System.out.println((z-c)/2);
			}
			else
			{
				System.out.println((c-z)/2);
			}
		}

	}

}
