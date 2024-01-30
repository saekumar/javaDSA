package saikumar;
import java.util.*;

public class priyanks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		pri(n,arr);
		

	}
	static void pri(int n,int a[]) {
		Arrays.sort(a);
		int k=0,c=0;
		for (int i = 0; i < n; i+=c) {
			k=a[i]+4;
			while(k>a[i])
			{
				i++;
				c++;
			}
			
		}
		System.out.println(c);
	}

}
