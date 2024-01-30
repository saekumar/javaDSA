package Codeforces;
//https://codeforces.com/problemset/problem/1303/A
import java.util.*;
public class ContinuousSegment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String s=sc.next();
			
			int st=0,end=0;
			if(s.length()==1)
			{
				System.out.println('0');
				
			}
			else
			{
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(ch=='1')
				{
					st=i;
					break;
				}
			}
			for(int i=s.length()-1;i>=0;i--)
			{
				if(s.charAt(i)=='1')
				{
					end=i;
					break;
				}
			}
			if(st==0 && end==0)
			{
				System.out.println(st);
				
			}
			else
			{
			int c=0;
			String k=s.substring(st, end+1);
			for(int i=0;i<k.length();i++) {
				if(k.charAt(i)=='0')
				{
					c++;
				}
			}
			System.out.println(c);
			}
			}
		}

	}
	
}
