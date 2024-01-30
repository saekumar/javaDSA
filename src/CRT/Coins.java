package CRT;
import java.util.*;

public class Coins {
    private static final int MOD = (int) (1e9 + 7);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // number of testcases
        while (T-- > 0) {
            int n = scanner.nextInt(); // number of coins
            int x = scanner.nextInt(); // desired sum
            int[] coins = new int[n];
            for (int i = 0; i < n; i++) {
                coins[i] = scanner.nextInt(); // value of each coin
            }
            int ways = countDistinctWays(coins, n, x);
            System.out.println(ways);
        }
        scanner.close();
    }

    private static int countDistinctWays(int[] coins, int n, int x) {
        int[][] dp = new int[n + 1][x + 1];

        // Base case: there's one way to make sum 0 (using no coins)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= x; j++) {
                if (coins[i - 1] > j) {
                    // Cannot use the current coin to make the sum j
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // Use the current coin either once or multiple times
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - coins[i - 1]]) % MOD;
                }
            }
        }

        return dp[n][x];
    }
}
