//wap to accept matrix of n*n and print as follows
//i/p: 4
// 1  2   3   4
// 5  6   7   8 
// 9  10  11  12
// 13 14  15  16
//o/p:  1  2  3  4
 //     5        8
//      9        12
//      13 14 15 16
        
package CRT;
import java.util.*;

public class Crt199 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j]=sc.nextInt();
				
			}
			
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[0][i]+" ");
			
		}
		for (int i = 0; i<n-1; i++) {
			System.out.print(arr[i+1][n-1]+" ");
			
		}
		for (int i = n-1; i>0; i--) {
			System.out.print(arr[n-1][i-1]+" ");
			
		}
		for (int i =n-1; i>1; i--) {
			System.out.print(arr[i-1][0]+" "+" \n");
			
		}
		two(n);



	}
	
	static void two(int n)
	{
		int a[][]=new int[n][n];
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j]=i+j;
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
