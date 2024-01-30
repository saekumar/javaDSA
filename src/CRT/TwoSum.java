package CRT;
import java.util.*;
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for (int i = 0; i < n; i++) {
			ar[i]=sc.nextInt();
			
		}
		int tar=sc.nextInt();
		Arrays.sort(ar);
		int st=0,end=n-1,sum=0;
		
		while(st<=end)
		{
			sum=ar[end]+ar[st];
			if(sum==tar)
			{
				System.out.println((st+1)+" "+(end+1));
				break;
			}
			else if(sum<tar)
			{
				st++;
			}
			else
			{
				end++;
			}
		}
		

	}

}
