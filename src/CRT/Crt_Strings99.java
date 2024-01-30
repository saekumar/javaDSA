package CRT;
import java.util.*;
public class Crt_Strings99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Reverse(s);

	}
	static void Reverse(String s)
	{
		int n=s.length();
		char arr[]=s.toCharArray();
		char t;
		int st=0,end=n-1;
		while(st<end)
		{
			if((s.charAt(st)>='a' && s.charAt(st)<='z') &&(s.charAt(end)>='a' && s.charAt(end)<='z'))
			{
				t=arr[st];
				arr[st]=arr[end];
				arr[end]=t;
				
				st++;
				end--;
			}
			else if(s.charAt(st)>='a' && s.charAt(st)<='z')
			{
				end--;
			}
			else if(s.charAt(end)>='a' && s.charAt(end)<='z')
			{
				st++;
			}
			else
			{
				st++;
				end--;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			
		}
	}

}
