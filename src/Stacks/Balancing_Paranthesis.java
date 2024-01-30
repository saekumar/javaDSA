package Stacks;
import java.util.*;
public class Balancing_Paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(isvalid(s));

	}
  public static boolean isvalid(String s)
  {
	  Stack<Character> stk=new Stack<>();
	  for(int i=0;i<s.length();i++)
	  {
		  char ch=s.charAt(i);
		  if(isOpen(ch))
		  {
			  stk.push(ch);
		  }
		  else
		  {
			  if(isClose(ch))
			  {
				  if(stk.isEmpty())
				  {
					  return false;
				  }
				  char po=stk.pop();
				  if(!Check(po,ch))
				  {
					 return false; 
				  }
				  
			  }
		  }
	  }
	  if(stk.isEmpty())
	  {
		  return true;
	  }
	  return false;
  }
  public static boolean isOpen(char ch)
  {
	  if(ch=='(' || ch=='{'  || ch=='[')
	  {
		  return true;
	  }
	  return false;
  }
  public static boolean isClose(char ch)
  {
	  if(ch==')' || ch=='}'  || ch==']')
	  {
		  return true;
	  }
	  return false;
  }
  public static boolean Check(char op,char ch)
  {
	  if((op=='('  && ch==')') || (op=='{' && ch=='}')  ||(op=='[' && ch==']'))
	  {
		  return true;
	  }
	  return false;
  }
}
