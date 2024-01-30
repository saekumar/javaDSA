package CRT;
import java.util.*;

public class Crt13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		Reverse(a,n);
		System.out.println(Arrays.toString(a));
		

	}
	static int[] Reverse(int a[],int n)
	{
		int te;
		for (int i = 0; i < a.length/2; i++) {
			te=a[i];
			a[i]=a[n-i-1];
			a[n-1-i]=te;
		}
		return a;
	}

}

//TIME COMPLEXITY:O(n/2)
//SPACE COMLEXITY:4+N*4+4....O(1)
