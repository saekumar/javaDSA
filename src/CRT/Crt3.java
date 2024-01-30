package CRT;
import java.util.*;
import java.lang.*;
import java.math.*;

public class Crt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=n;
		int z=n;
		int k=0,c=0,s=0;
		while(n>0)
		{
			
			
			n/=10;
			k++;
			
		}
		System.out.println(k);
		while(d>0)
		{
			
			s+=Math.pow(d%10, k);
			d/=10;
		}
		System.out.println(s);
		if(s==z)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
