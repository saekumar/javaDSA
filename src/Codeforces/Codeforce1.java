package Codeforces;

import java.util.Scanner;

public class Codeforce1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        
        while (testCase-- > 0) {
            int n = scanner.nextInt();
            int[] v = new int[n];
            
            for (int i = 0; i < n; i++) {
                v[i] = scanner.nextInt();
            }
            
            int minOdd = Integer.MAX_VALUE;
            
            for (int i = 0; i < n; i++) {
                if ((v[i] & 1) == 1) {
                    minOdd = Math.min(minOdd, v[i]);
                }
            }
            
            boolean makeEven = true;
            boolean makeOdd = true;
            
            for (int i = 0; i < n; i++) {
                if ((v[i] & 1) == 0 && v[i] <= minOdd) {
                    makeOdd = false;
                }
            }
            
            for (int i = 0; i < n; i++) {
                if ((v[i] & 1) == 1 && v[i] <= minOdd) {
                    makeEven = false;
                }
            }
            
            if (makeOdd || makeEven) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
