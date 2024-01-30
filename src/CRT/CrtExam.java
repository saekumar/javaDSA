package CRT;
import java.util.*;
public class CrtExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(check(n));
		

	}
	static int check(int n)
	{
		int c=0;      
		while(n!=1)//n=5
		{
			if(n%2==0)//
			{
				n/=2;//8//4//2//1
			}
			else
			{
				n=3*n+1;//n=16
			}
			c++;
		}
		return c;
	}

}
