package CRT;
import java.util.*;

public class Crt5Basesal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		
		double sal=sc.nextDouble();
		double hra,da,gross;
		if(sal<1500)
		{
			hra=sal/10;
			da=(sal*9)/10;
		}
		else
		{
			hra=500;
			da=(sal*98)/100;
			
		}
		gross=sal+hra+da;
		System.out.println(gross);
		
		}
		

	}

}
