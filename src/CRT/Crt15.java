//	wap	 to accept n eles of array and print the first occurrence pair of sum k 
package CRT;
import java.util.*;
public class Crt15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int x=sum(n,arr,k);
		if(x==-1)
		{
			System.out.println("NO PAIRS  EXISTT.. ");
		}
		

	}
	public static int  sum(int n,int a[],int k)
	{
		int min,max;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]+a[j]==k)
				{
					if(a[i]<a[j])
					{
						min=a[i];
						max=a[j];
					}
					else
					{
						min=a[j];
						max=a[i];
					}
					System.out.println(min+ " "+max);
					return 1;
					
				
				}
				
			}
		}
		return -1;
	}

}
//Time Complexity: 1<logn<sqrt(n)<n<nlogn<nsqrtn<n^2....n^n
//input    algorithmm
//10^2     1,logn,sqrtn,n,.....n^4
//10^3     1,logn,.......n^2sqrtn
//10^4     1,logn,....n^2
//10^6     1,logn,....nlogn
//10^8     1,logn,....n
//10^16    1,logn,....sqrtn
//10^18    1,logn
//Time Complexity:O(n^2)
        // input   time(O(n^2))      Time(O(nlogn))
     //     100     10^4               10^2*log2^6==>6*10*
       //   10^3    10^6
     //     10^4    10^8
        //  10^5    10^10==>TLE
//Space Complexity:O(1)
