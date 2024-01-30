package CRT;
import java.util.*;

public class Crt7Lib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double s=0;
		if(n<=30)
		{
			s=0;
		}
		else if(n>30 && n<=60)
		{
			s=(n-30)*0.5;
		}
		else if(n>60 && n<=120)
		{
			s=30*0.5+(n-60)*1;
		}
		else if(n>120 && n<=360)
		{
			s=30*0.5+60*1+(n-120)*2;
		}
		else 
		{
			s=30*0.5+60*1+240*2+(n-360)*4;
		}
		System.out.println("TOTAL AMOUNT :"+s);

	}

}

