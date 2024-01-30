package CRT;
import java.util.*;

public class Specialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int c=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='@' || s.charAt(i)=='#' || s.charAt(i)=='*' || s.charAt(i)=='!')
			{
				c++;
			}
			
			
		}
		System.out.println(c);
		int k=special(s);
		System.out.println(k);

	}
	public static  int special(String s) {
		int k=0;
		for (int i = 0; i < s.length(); i++) {
			if((s.charAt(i)>='a'&&s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9'))
			{
				continue;
			}
			else
			{
				k++;
			}
			
		}
		return k;
	}
	{
		
	}

}
