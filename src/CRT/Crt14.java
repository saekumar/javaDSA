//WAP to accept n elems into array and reverse last k eles //
package CRT;
import java.util.*;
public class Crt14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		Reverse(n,a,k);
		System.out.println(Arrays.toString(a));

	}
	static int[] Reverse(int n,int a[],int k)
	{
		int te;
		for (int i = n-1-k; i < a.length; i++) {
			te=a[i];
			a[i]=a[n-1-k];
			a[n-1-k]=te;
			
		}
		return a;
	}

}
