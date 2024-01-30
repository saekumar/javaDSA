package Leetcodesums;
import java.util.*;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(power(n));
		System.out.println(powerofthree(n));

	}
	static boolean power(int n)
	{
		
		if(n==1)
		{
			return true;
		}
		if(n%2!=0 || n==0)
		{
			return false;
		}
		return power(n/2);
		
	}
  static boolean powerofthree(int n)
  {
	  if(n==1)
	  {
		  return true;
	  }
	  else if( n%3!=0 || n==0)
	  {
		  return false;
	  }
	  return powerofthree(n/3);
  }
}
