package CRT;
import java.util.*;

public class Crt10Loops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=0,y=1,k;
		int a[]=new int[n];
		a[0]=x;
		a[2]=y;
		for (int i = 4; i < n; i+=2) {
			
			
			k=x+y;
			a[i]=k;
			x=y;
			y=k;
			
			
			
		}
		
		
		for (int i = 1; i < a.length; i+=2) {
			a[i]=i/2+1;
		
			
		}
		System.out.println(Arrays.toString(a));

	}

}
