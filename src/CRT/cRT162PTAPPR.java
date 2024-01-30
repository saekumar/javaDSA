//2 pointer approach...
package CRT;
import java.util.*;

public class cRT162PTAPPR {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int  i= 0;  i< arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		if(sum(arr,n,k)==-1)
		{
			System.out.println("NO PAIRS EXIST...");
		}

	}
	public static int sum(int a[],int n,int k)
	{
		Arrays.sort(a);
		int x=0,y=n-1;
		while(x<y)
		{
			if((a[x]+a[y])==k)
			{
				
				System.out.println(x+" "+y);
				return 1;
			}
			else if((a[x]+a[y])>k)
			{
				y--;
			}
			else
			{
				x++;
			}
			
		}
		return -1;
	}

}
//Time Complexity:O(nlogn)
//Space Complexity:O(1)
