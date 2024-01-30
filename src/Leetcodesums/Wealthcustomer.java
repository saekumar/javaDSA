package Leetcodesums;
import java.util.*;

public class Wealthcustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int s[]=new int[r];
        int k=0;
        int a[][]=new int[r][c];
        for (int i = 0; i < r; i++) {
        	for (int j = 0; j < c; j++) {
        		a[i][j]=sc.nextInt();
				
			}
			
		}
        for (int i = 0; i < r; i++) {
        	for (int j = 0; j < c; j++) {
        		k+=a[i][j];
				
			}
        	s[i]=k;
        	k=0;
			
		}
        Arrays.sort(s);
        System.out.println(""+s[r-1]);
	}

}
