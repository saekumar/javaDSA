package Leetcodesums;
import java.util.*;

public class Ceilingchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        int j=0,k=0;
        int a[]=new int[n];
        
        for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
			
		}
        int tar=sc.nextInt();
        int arr[]=new int[a.length];
    	for (int i = 0; i < a.length; i++) {
			if(a[i]==tar)
			{
				arr[j]=i;
				j++;
			}
			else
			{
				k=1;
			}
			
		}
    	if(k==1)
    	{
    		System.out.println("NO ELEMENT IN THIS ARRAY");
    	}
    	for (int i = 1; i < arr.length; i++) {
			if(arr[i]==0)
			{
				System.out.println(arr[0]+" "+arr[i-1]);
				break;
			}
		}
    	
  
	}
    
   
}
