package Atcoder;
import java.util.*;
public class MinSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new  Scanner(System.in);
       int n=sc.nextInt();
       int p=sc.nextInt();
       int q=sc.nextInt();
      
       int a[]=new int[n];
       for (int i = 0; i < n; i++) {
    	   a[i]=sc.nextInt();
		
	}
       int s=0;
       Arrays.sort(a);
       if((a[0]+q)<=p)
       {
    	   System.out.println(a[0]+q);
    	   
       }
       else
       {
    	   System.out.println(p);
       }
       
	}

}
