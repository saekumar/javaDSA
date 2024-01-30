package saikumar;
import java.util.*;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(); 
		
			
		n=recursion(n);
		System.out.println(" "+n);

	}
	public static int recursion(int n)
	{
		if(n==1)
		{
			return 0;
		}
		else if(n==2)
		{
			return 1;
		}
		else
		{
			return recursion(n-1)+recursion(n-2);
		}
	}

}
