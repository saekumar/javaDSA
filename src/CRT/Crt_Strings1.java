package CRT;
import java.util.*;
public class Crt_Strings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		frequency1(s);
		frequency2(s);
		frequency3(s);

	}
	static void frequency1(String s)//TimeComplexity:O(n*n)
	{
		int n=s.length();
		int c;
		for(char ch='a';ch<='z';ch++)//=====>26
		{
			c=0;
			for(int i=0;i<n;i++)//======26*n
			{
				if(s.charAt(i)==ch)//=====>n*26
				{
					c++;
				}
			}
			if(c>0)//====>26
			{
				System.out.println(ch+":"+c);
			}
		}
		
	}
	static void frequency2(String s)//Time complexity:O(nlogn)
	{
		int n=s.length();
		char arr[]=new char[n+1];
		for (int i = 0; i < n; i++) {
			
			arr[i]=s.charAt(i);
		}
		arr[n]='|';
		Arrays.sort(arr);//=======>O(nlogn)
		
		
		int c=0;
		for (int i = 0; i <n; i++)//=======>O(n)
		{
			
			if(arr[i]==arr[i+1]) {
				c++;
			}
			else if(arr[i]!=arr[i+1])
			{
				System.out.println(arr[i]+":"+(c+1));
				c=0;
			}
			
		}
	}
	static void frequency3(String s)//TimeComplexity:O(n)
	{
		int n=s.length();
		int arr[]=new int[26];
		for (int i = 0; i < 26; i++)//======>26//n
		{
			arr[i]=0;
		}
		for (int i = 0; i <n; i++)//=====>n
		{
			arr[s.charAt(i)-97]++;
			
		}
		for (int i = 0; i <26; i++) //=====>26//n
		{
			if(arr[i]>0)
			{
				System.out.println((char)(i+97)+":"+arr[i]);
			}
		}
	}

}
