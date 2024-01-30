package saikumar;
import java.util.*;

public class Phone {

	public static void main(String[] args) {
		// TOO Auto-generated method stub
		long  a;
		int k=0,s=0,r=0,t=0;
		a=80741497;
		while(a>807414)
		{
			 k=(int) (a%10);//7//9
			 s+=k;//7//16
			 a/=10;//8074149//807414
			
		}
		a/=10000;
		while(a>0)
		{
			r=(int) (a%10);//0//8
			t+=r;//0//8
			a/=10;//8//0
		}
		System.out.println(" ans is :"+(t+s));
		
		

	}

}
