//wap to acept matrix of n*n and print row wise prefix sum
//wap to acept matrix of n*n and print row,col wise prefix sum
//i/p: 3
// 1 2 3
// 4 5 6
// 7  8 9
//o/p:1 3 6
//    4 9 15
//    7 15 24


//o/p2: 1 3 6
//      5 12 21
//      12 34 67
package CRT;

import java.util.Arrays;
import java.util.Scanner;

public class Crt191 {

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
		rowpresum(n,arr);
		colpresum(n,arr);

	}
	public static void rowpresum(int n,int a[][])
	{
		
		for (int i = 0; i < n; i++) {
		
			for (int j = 0; j < n-1; j++) {
				a[i][j+1]+=a[i][j];
				
				
				
			}
			
			
			
		}
		for (int i = 0; i < n; i++) {
		
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j]+" ");
				
				
				
			}
			System.out.println();
			
			
			
		}
		System.out.println();
		
	}
	public static void colpresum(int n,int a[][])
	{
		
		for (int j = 0; j < n; j++) {
			
			for (int i = 0; i < n-1; i++) {
				a[i+1][j]+=a[i][j];
				
				
				
				
			}
			
			
			
		}
for (int j = 0; j < n; j++) {
			
			for (int i = 0; i < n; i++) {
				System.out.print(a[j][i]+" ");
				
				
				
				
			}
			System.out.println();
			
			
			
		}
	}

}
