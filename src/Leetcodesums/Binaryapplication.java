package Leetcodesums;
//https://leetcode.com/problems/kth-missing-positive-number/
import java.util.*;
public class Binaryapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		System.out.println(bina(arr,k,n));
		

	}
	static int bina(int a[],int k,int n)
	{
		int st=0,end=n-1,mid;
		while(st<=end)
		{
			mid=st+(end-st)/2;
			if(a[mid]-mid-1<k)
			{
				st=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		return st+k;
	}

}
