package saikumar;

import java.util.Scanner;

public class Reversenmbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();//23597
		int k,r,a=0;
		while(n>0)
		{
			
			 r=n%10;//7
			 n/=10;
			 a=a*10+r;
			
			 
			 
			
		}
		System.out.println(""+a);

	}

}
