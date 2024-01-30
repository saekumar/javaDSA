package Codeforces;
import java.util.*;

public class Lessthan100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0)
     {
    	 int k=sc.nextInt();
    	  System.out.println(getanswer(k));  
    	 
    	 
     }
	}
	static int  getanswer(int k)
	{
		int c=0;
		for (int i = 1; i <=k; i++) {
			if(issqr(i))
			{
				c++;
			}
			else if (iscube(i))
			{
				c++;
			}
			
			
		}
		return c;
	}
	static boolean issqr(int s)
	{
		int root=(int)Math.sqrt(s);
		return (root*root)==s;
	}
	static boolean iscube(int s)
	{
		int root=(int)Math.cbrt(s);
		return (root*root*root)==s;
	}

}
