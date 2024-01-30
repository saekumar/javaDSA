package Jpmorgan;
import java.util.*;

public class abc20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(check(s));

	}
	static int check(String s)
	{
		int n=s.length();
		int k=0,m=0;
		for (int i = n-1; i >= 0; i--) {
			
			k+=(s.charAt(i)-'a'+1)*(Math.pow(20, m++));
			
		}
		return k;
	}

}
