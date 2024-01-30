//https://codeforces.com/problemset/problem/1788/A
package Codeforces;
import java.util.*;

public class Maths {

	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();
	        while (t-- > 0) {
	            int n = scanner.nextInt();
	            int[] a = new int[n];
	            for (int i = 0; i < n; i++) {
	                a[i] = scanner.nextInt();
	            }
	            int k = findK(a, n);
	            System.out.println(k);
	        }
	    }

	    private static int findK(int[] a, int n) {
	        int productLeft = 1;
	        int productRight = 1;
	        for (int i = 0; i < n - 1; i++) {
	            productLeft *= a[i];
	            for (int j = i + 1; j < n; j++) {
	                productRight *= a[j];
	            }
	            if (productLeft == productRight) {
	                return i + 1;
	            }
	            productRight = 1;
	        }
	        return -1;
	    }
	

}
