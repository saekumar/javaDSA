package Atcoder;
import java.util.*;
public class FullMoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int p=sc.nextInt();
      int c=0;
      while(m<=n)
      {
    	  m+=p;
    	  c++;
    	  
    	  
      }
      System.out.println(c);
	}

}
