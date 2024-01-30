package saikumar;
import java.util.*;
//suppose we are given a long int number and we've to count the occurence of a particular nmbr.
//let us say here the nmbr is 4551221789 and we will count the occurence of 5.It will be 2.

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	
		int kw=s.nextInt();
		int c=0;
		while(kw>0)
		{
			int r=(kw%10);
			if(r==5)
			{
				c++;
			}
			kw/=10;
		}
		System.out.println(""+c);
		
		
 
	}

}
