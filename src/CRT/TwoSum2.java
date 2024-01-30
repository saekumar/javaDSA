package CRT;
//https://leetcode.com/problems/two-sum/
import java.util.*;
public class TwoSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int tar=sc.nextInt();
		find(ar,tar);
		

	}
	public static int[] find(int a[],int tar)
	{
		int res[]=new int[2];
		HashMap<Integer, Integer> hash=new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			int x=tar-a[i];
			if(hash.containsKey(x))
			{
				res[0]=hash.get(x);
				res[1]=i;
				break;
				
			}
			else
			{
				hash.put(a[i], i);
			}
		}
		
		
		return res;
	}

}
