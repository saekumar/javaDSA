package CRT;

import java.util.Scanner;

//Wap to print len,boundaries of sub-array which contains only +ve nmbrs...
//constraint :
//0<n<=10^5
//-10^10<a[ele]<10^10
//i/p: 11
//7 8 -2 4 5 6 1 -7 9 2 -10
//O/P: 4----->len
//4 5 6 1----->Elements
public class Crt194 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(kadane(n, arr));
		

	}
	static int kadane(int n,int a[])
	{
		int glo=Integer.MIN_VALUE,loc=0,s=0,k=0,ns=0,len=0;
		for (int i = 0; i < n; i++) {
			if(a[i]<0)
			{
				if(len<i-ns)
				{
					s=ns;k=i;len=i-ns;
					
				}
				ns=i+1;
			}
		}
		System.out.println(len);
		for (int i = s; i <=k; i++) {
			System.out.println(a[i]+ " ");
			
		}
		return glo;
	}

}
