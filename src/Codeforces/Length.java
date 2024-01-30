package Codeforces;
import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of testcases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // target sum
            int k = scanner.nextInt(); // maximum integer
            int x = scanner.nextInt(); // excluded integer

            solve(n, k, x);
        }

        scanner.close();
    }

    private static void solve(int n, int k, int x) {
        if (k == 1) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
        int m = Math.min(n - 1, k - 2);
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= m; i++) {
            if (i != x) {
                result.append(i).append(" ");
            }
        }

        if (m < n - 1) {
            result.append(n);
        } else {
            result.append(k);
                }

        System.out.println(m + 1);
        System.out.println(result.toString().trim());
    }
}
