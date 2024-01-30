package CRT;
import java.util.*;
public class Max_SubArray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int ar[]=new int[n];
		ArrayList<Integer> arr =new ArrayList<>();
		Set<Integer> se=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		
		
		
		for(int i=0;i<n-k+1;i++)
		{
			for(int j=i;j<i+k-1;j++)
			{
				se.add(ar[j]);
			}
			System.out.println(se.size());
			
			
		}
		
		
		
		

	}
 public static int check(int ar[],int tar)
 {
	 
	 int n=ar.length;
	 int st=0,end=n-1;
	 int sum=0;
	 int max=0;
	 while(end<n)
	 {
		sum+=ar[st];
		if(st==end)
		{
			max=Math.max(sum, max);
			st-=1;
			end+=tar-1;
		}
		else
		{
			st++;
		}
	 }
	 return max;
 }

}
