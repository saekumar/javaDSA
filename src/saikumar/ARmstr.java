package saikumar;
import java.util.*;
public class ARmstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Sai s=new Sai();
		if(s.str(a)==1)
		{
			
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		

	}

}
class Sai
{
	public int str(int a)
	{
		int s=0,r=0;
		int t=a;
		while(a>0)
		{
			r=a%10;
			s+=Math.pow(r, 3);
			a/=10;
		}
		if(t==s)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
