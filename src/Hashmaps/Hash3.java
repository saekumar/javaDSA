package Hashmaps;

import java.util.*;
public class Hash3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int a[]=new int[9];
		
//		HashMap<Integer, Integer> sai=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		for (int i = 0; i<9; i++) {
			a[i]=0;
			
		}
		int k=n/3;
		if(k==0)
		{
			for (int i = 0; i <n; i++) {
				System.out.println(arr[i]+ " ");
				
			}
		}
		else
		{
			Arrays.sort(arr);

			for (int i = 0; i < n-1; i++) {
				if(arr[i]==arr[i+1])
				{
					a[arr[i]]+=1;
				}
			}
			for (int i = 0; i < a.length; i++) {
				
				if(a[i]>=k-1)
				{
					System.out.print(i+" ");
				}
				
				
			}
			
		}

		
		
		


		frequency(n,arr);

	}
	public static void frequency(int n,int a[])
	{
		int k=n/3;
		int c=0;
		HashMap<Integer, Integer> sai=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(sai.containsKey(a[i]))
			{
				sai.put(a[i], sai.get(a[i])+1);
			}
			else
			{
				sai.put(a[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> s:sai.entrySet())
		{
			if(s.getValue()>k)
			{
				System.out.print(s.getKey()+" ");
			}
		}
	}

}
