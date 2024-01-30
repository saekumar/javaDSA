//wap to print frequency of each char of a given string
//i/p:  aaabva
//o/p: a:4 b:1 v:1


package CRT;
import java.util.*;

public class Crt_strings98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		frequency1(s);
		//frequency2(s);
		frequency3(s);//Very Important
		

	}
	static void frequency1(String s)//Time complexity:O(26*n)===>O(n*n)
	{
		int n=s.length();
		for(char ch='a';ch<='z';ch++)
		{
			int fre=0;
			for (int i = 0; i < n; i++) {
				if(s.charAt(i)==ch)
				{
					fre++;
				}
				
			}
			if(fre>0)
			{
				System.out.println(ch+":"+fre);
			}
		}
	}
	static void frequency2(String s)
	{
		int n=s.length();
		char arr[]=s.toCharArray();
		Arrays.sort(arr);
		int k=0;
		for (int i = 0; i < arr.length-1; i++) {
			
			
			if(arr[i]==arr[i+1])
			{
				k++;
			}
			else if(arr[i]!=arr[i+1])
			{
				System.out.println(arr[i]+":"+(k+1));
				k=0;
			}
			
			
		}
	}
	static void frequency3(String s)
	{
		int count[]=new int[26];
		int n=s.length();
		for (int i = 0; i < 26; i++) {
			count[i]=0;
			
		}
		for (int i = 0; i < n; i++) {
			count[s.charAt(i)-97]++;
			
		}
		for (int i = 0; i <26; i++) {
			if(count[i]!=0)
			{
				System.out.println((char)(i+97)+":"+count[i]);
			}
			
		}
	}


}
