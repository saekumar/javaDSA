//Wap to accept a nmbr and flip the consecutive binary bits for a given nmbr and print difference
//b/w given nmbr and updated nmbr.
//Const: 0<n<10^8
//i/p: 16   010000=== >100000 32 === >32-16
//o/p: 16
package CRT;
import java.util.*;

public class Crt17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		String f="0";
		String k=Integer.toBinaryString(n);
		if(k.length()%2!=0)
		{
			 k=f.concat(Integer.toBinaryString(n));
		}
		
		StringBuilder sb = new StringBuilder();
		
		char ar[]=new char[k.length()];
		System.out.println(n+" \n"+k);
		for (int i =k.length()-1; i >0 ; i-=2) {
			char s,x;
			s=k.charAt(i);
			x=k.charAt(i-1);
			ar[i]=x;
			ar[i-1]=s;
			
			
			
		}
		
		for (int i = 0; i < ar.length; i++) {
			sb.append(ar[i]);
			
		}
		System.out.println(sb);
		int dsa=Integer.parseInt(sb.toString(),2); 
		System.out.println(dsa+" \n"
				+ ""+(dsa-n)+" ");
		

	}

}
