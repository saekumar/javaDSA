package Atcoder;

import java.util.*;


public class Candies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int evenCount = 0;
            int oddCount = 0;

            for (int j = 0; j < n; j++) {
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            if (evenCount % 2 == 0 && oddCount % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
