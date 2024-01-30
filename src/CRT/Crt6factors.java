package CRT;
import java.util.*;

public class Crt6factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int n=sc.nextInt();
		int s=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				s+=i;
			}
		}
		if(s>0)
		{
			System.out.println(""+s);
		}
		else
		{
			System.out.println("-1");
		}
		}
	}

}
