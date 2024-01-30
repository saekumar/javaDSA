package saikumar;
import java.util.*;
public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int c=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='$' || s.charAt(i)=='*' || s.charAt(i)=='#')
			{
				c++;
			}
			
		}
		System.out.println(""+c);

	}

}
