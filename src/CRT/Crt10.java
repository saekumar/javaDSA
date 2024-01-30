package CRT;
import java.util.*;

public class Crt10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		Evensum(arr,n);
		

	}
	static void Evensum(int a[],int k)
	{
		int s=0;
		for (int i = 1; i < a.length; i+=2) {
			s+=a[i];
		}
		System.out.println("SUM :"+s);
	}

}
