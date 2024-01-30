//wap to accept N eles into arr and rotate left side of k positions. 

//1 2 3 4 5 6
//k=0,6,12....
package CRT;
import java.util.*;

public class Crt11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		int k=sc.nextInt();
		Leftrotate(arr,n,k);
		
		

	}
	static void Leftrotate(int a[],int x,int y)
	{
		int te;
	for(int j=0;j<y%x;j++)
	{
		 te=a[0];
		for (int i = 0; i < a.length-1; i++) {
			a[i]=a[i+1];
		}
		a[x-1]=te;
	}
		System.out.println(Arrays.toString(a));
		Rightrotate(a, x, y);
		
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
		int sum=a[0]+a[n-1];
		
		
		
		System.out.println(Arrays.toString(a)+" "+sum);
	}
	


}
