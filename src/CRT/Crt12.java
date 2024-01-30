//wap for right rotation for k positions
//1 2 3 4 5 6 7
//7  1 2 3 4 5 6 (k=1)
//6 7 1 2 3 4 5 (k=2)
package CRT;
import java.util.*;

public class Crt12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		Rightrotate(arr,n,k);
		

	}
	static void Rightrotate(int a[],int n,int k)
	{
		int te;
		
		
		for (int i = 0; i < k%n; i++) {
			te=a[n-1];
			for (int j = n-1; j >0; j--) {
				a[j]=a[j-1];
				
			}
			a[0]=te;
			
		}
		
		
		
		System.out.println(Arrays.toString(a));
	}

}
