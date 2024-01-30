package Atcoder;

import java.util.*;
public class Vacation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		String sa[]=new String[n];
		for (int i = 0; i <n; i++) {
			sa[i]=sc.next();
			
			
		}
		int ar[]=new int[n];
		for (int i = 0; i < n; i++) {
			ar[i]=count(sa[i]);
			
		}
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println(ar[0]);
			

	}
	public static int count(String input) {
        int count = 0;
        int maxCount = 0;
        int ar[]=new int[2];

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'o') {
                count++;
                ar[0]=i;
                
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        ar[1]=maxCount+ar[0];

        return ar[1];
    }
	

}
