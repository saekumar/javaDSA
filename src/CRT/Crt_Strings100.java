package CRT;
//wap to check the given string is palindrome or not
import java.util.*;

public class Crt_Strings100 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c='b';
		System.out.println(count(s,c));
		System.out.println(palin(s));

	}
  static int count(String s, char c)
  {
	  int k=0;
	  for (int i = 0; i < s.length(); i++) {
		  if(s.charAt(i)==c)
		  {
			  k++;
		  }
		
	}
	  return k;
  }
  static String palin(String s)
  {
	  int k=0;
	  int n=s.length();
	  for (int i = 0; i < n; i++) {
		  if(s.charAt(i)!=s.charAt(n-i-1))
		  {
			  k=1;
		  }
		
	}
	  if(k==0)
	  {
		  return "yes";
	  }
	  else
	  {
		  return "no";
	  }
  }
}
