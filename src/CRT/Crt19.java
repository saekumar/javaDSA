//wap to accept r rows and  c cols and print col wise maximaa... 
package CRT;
import java.util.*;
public class Crt19 {

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
       ColMax(m,r,c);

	}
	static void ColMax(long a[][],int r,int c)
	{
		long k;
		for (int i = 0; i < c; i++) {
			k=Integer.MIN_VALUE;
			for (int j = 0; j < r; j++) {
				
				if(a[j][i]>k)
				{
					k=a[j][i];
				}
			}
			System.out.println("maximum is "+k);
			
		}
	}

}
