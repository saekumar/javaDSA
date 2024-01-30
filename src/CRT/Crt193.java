package CRT;
//Wap to print len,boundaries of sub-array whose sum is maximum...
// constraint :
//0<n<=10^5
//-10^10<a[ele]<10^10
//i/p: 10 
//9 2 -13 7 5 8 -40 6 54 65
//O/P: 3----->len
//7 9----->boundaries
import java.util.*;

public class Crt193 {

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
		int glo=Integer.MIN_VALUE,loc=0,s=0,k=0,ns=0;
		for (int i = 0; i < n; i++) {
			loc+=a[i];
			if(loc>=glo)
			{
				glo=loc;
				s=ns;
				k=i;
			}
			else if(loc<0)
			{
				loc=0;
				ns=i+1;
			}
		}
		System.out.println(k-s+1);
		System.out.println(s+ " "+k);
		return glo;
	}

}
