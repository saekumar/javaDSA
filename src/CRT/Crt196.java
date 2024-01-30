package CRT;
import java.util.*;

public class Crt196 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
      int arr[]=new int[n];
      
      for (int i = 0; i < n; i++) {
    	  arr[i]=sc.nextInt();
    	 
		
	}
      int tar=sc.nextInt();
      if(binary(n,tar,arr)==0)
    	  {
    	   System.out.println("NO....IT DOESN'T");
    	  }
      else
      {
    	  System.out.println("YES ...IT EXISTS AT INDEX:"+binary(n, tar, arr));
      }
     
      
      
	}
	static int binary(int n,int target,int a[])
	{
		Arrays.sort(a);
		int st=0,end=n-1,mid;
		while(st<end)
		{
			mid=(end-(end-st)/2);
			if(target==a[mid])
			{
				return mid;
			}
			else if(target<a[mid])
			{
				end=mid-1;
			}
			else
			{
				st=mid+1;
			}
		}
		return 0;
	}

}
