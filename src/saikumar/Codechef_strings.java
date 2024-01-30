package saikumar;
import java.util.*;
public class Codechef_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		string1(n,s);
	}
	static void string1(int n,String s)
	{
		int c=0;
		int k=s.charAt(n-1)-96;
		char arr[]=s.toCharArray();
		char a[]=new char[k];
		for (int i = 0; i < n-1; i++) {
			if(arr[i]!=arr[i+1])
			{
				a[c++]=arr[i];
			}
		}
		a[k-1]=arr[n-1];
		String sa=new String(a);
		System.out.println(sa);
	
		
	}

}
