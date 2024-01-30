package saikumar;
import java.util.*;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
			
		}
		bubble(arr,n);

	}
	public static void bubble(int a[],int n)
	{
		int k;
		int te;
		for (int i = 0; i < n; i++) {
			k=0;
			for (int j =1; j <n-i ; j++) {
				if(a[j-1]>a[j])
				{
					te=a[j];
					a[j]=a[j-1];
					a[j-1]=te;
					k=1;
				}
				
			}
			if(k==0)
			{
				break;
			}
			
			
		}
		System.out.println(Arrays.toString(a));
	}

}
