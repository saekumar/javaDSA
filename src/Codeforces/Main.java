package Codeforces;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // size of permutation

            if (n <= 2) {
                System.out.println("-1");
            } else {
                int[] permutation = new int[n + 1];
                int evenIndex = n;
                int oddIndex = n - 1;

                // Fill even indices with numbers in descending order
                for (int i = 2; i <= n; i += 2) {
                    permutation[evenIndex] = i;
                    evenIndex -= 2;
                }

                // Fill odd indices with numbers in descending order
                for (int i = 1; i <= n; i += 2) {
                    permutation[oddIndex] = i;
                    oddIndex -= 2;
                }

                // Print the permutation
                for (int i = 1; i <= n; i++) {
                    System.out.print(permutation[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
