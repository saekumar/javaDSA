package Codeforces;
import java.util.*;

public class LexicographicallyLargestPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // size of permutation

            if (n <= 2) {
                System.out.println("-1");
            } else {
                if (n % 2 == 1) {
                    // Print lexicographically largest permutation for odd n
                    for (int i = n; i > 0; i--) {
                        System.out.print(i + " ");
                    }
                } else {
                    // Print lexicographically largest permutation for even n
                    for (int i = n - 1; i > 0; i--) {
                        System.out.print(i + " ");
                    }
                    System.out.print(n + " ");
                }

                System.out.println();
            }
        }
    }
}
