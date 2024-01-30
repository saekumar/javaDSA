package CRT;
import java.util.*;

public class Crt18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		long m[][]=new long[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				m[i][j]=sc.nextLong();
				
			}
			
		}
       Max(m,r,c);
	}
	static void Max(long a[][],int r,int c)
	{
		long k;
		for (int i = 0; i < r; i++) {
			k=Integer.MIN_VALUE;
			for (int j = 0; j < c; j++) {
				if(a[i][j]>k)
				{
					k=a[i][j];
				}
				
				
			}
			System.out.println("Maximum is "+k);
			
		}
	}

}
