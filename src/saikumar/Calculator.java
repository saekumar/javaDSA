package saikumar;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int res=0;
		boolean sai=true;
		while(sai)
		{
			System.out.println("Enter operator : ");
			char sym=sc.next().trim().charAt(0);
			if(sym=='+' || sym=='-'|| sym=='*' || sym=='/')
			{
				System.out.println("Enter 2 nmbrs :");
				int num1=sc.nextInt();
				int num2=sc.nextInt();
				if(sym=='+')
				{
					res=num1+num2;
				}
				else if(sym=='-')
				{
					res=num1-num2;
					if(res<0)
					{
						res*=-1;
					}
				}
				else if(sym=='*')
				{
					res=num1*num2;
				}
				else
				{
					res=num1/num2;
					if(res<0)
					{
						res=num2/num1;
					}
				}
				System.out.println("answer is "+res);
			}
			else if(sym=='x' || sym=='X')
			{
				System.out.println("Tnank You for ur time...");
				break;
				
			}
			else
			{
				System.out.println("invalid ");;
			}
		}

	}

}
