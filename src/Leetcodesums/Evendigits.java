package Leetcodesums;
import java.util.*;
import java.util.Scanner;
public class Evendigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       
       int a[]=new int[n];
       for (int i = 0; i < a.length; i++) {
    	   a[i]=sc.nextInt();
		
	}
     
		int k=digicalc(a);
		System.out.println(""+k);
	
       
	}
	static int digicalc(int a[])
	{
		int j=0;
		for(int i:a)
		{
			int c=0;
			while(i>0)
			{
				int r=i%10;
				c++;
				i/=10;
				
				
			}
			if(c%2==0)
				{
				   j++;
				}
		}
		return j;
	}

}
