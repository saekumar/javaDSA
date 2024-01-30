package Codeforces;

import java.util.*;
public class Plaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		int st=0,end=n-1,c=0;
		while(st<end)
		{
			if(s.charAt(st)==s.charAt(end))
			{
				c++;
			}
			
				
				st++;
				end--;
			
				
		}
	

	}

}
