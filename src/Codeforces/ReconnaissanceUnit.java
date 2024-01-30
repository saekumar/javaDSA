package Codeforces;

import java.util.*;

public class ReconnaissanceUnit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Number of soldiers
        int d = scanner.nextInt(); // Maximum allowed height difference
        int[] heights = new int[n]; // Heights of soldiers

        // Read the heights of soldiers
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        int count = 0;

        // Count the number of pairs whose height difference doesn't exceed d
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(heights[i] - heights[j]) <= d) {
                    count += 2; // Counting pairs in both directions
                }
            }
        }

        System.out.println(count);

        scanner.close();
    }
}
