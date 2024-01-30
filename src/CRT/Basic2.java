package CRT;
import java.util.*;
public class Basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.matches("[A-Z]{1}[0-9]{1}[A-Z]{1}"))
		{
			System.out.println("vali");
		}
		else
		{
			System.out.println("not");
		}

	}

}
