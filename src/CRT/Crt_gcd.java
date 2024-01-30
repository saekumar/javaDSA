package CRT;
import java.util.*;
public class Crt_gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(a==0 || b==0)
    {
    	System.out.println("ERROR 404...plese enter valid numbers ");
    }
   
    else
    {
    	System.out.println(gcd_recursion(a,b));
    }
   
	}
	static int gcd_recursion(int a,int b)
	{
		int max,min,rem;
		if(a>b)
		{
			max=a;
			min=b;
		}
		else
		{
			max=b;
			min=a;
		}
		if(max%min==0)
		{
			return min;
		}
		else
		{
			rem=max%min;
			return gcd_recursion(min,rem);
		}
	}

}
