package CRT;
import java.util.*;

public class Crt4Harshad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0,k=n;
		while(n>0)
		{
			s+=n%10;
			n/=10;
		}
		System.out.println(s);
		if(k%s==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		

	}

}
