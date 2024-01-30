package Atcoder;
import java.util.*;
public class FirstABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int a=0,b=0,c=0;
		for (int i = 0; i < n; i++) {
			if(s.charAt(i)=='A')
			{
				a++;
			}
			else if(s.charAt(i)=='B')
			{
				b++;
			}
			else if(s.charAt(i)=='C')
			{
				c++;
			}
			if(a>=1 && b>=1 && c>= 1)
			{
				System.out.println(i+1);
				break;
			}
			
		}

	}

}
