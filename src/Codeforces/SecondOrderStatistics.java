package Codeforces;

import java.util.*;

public class SecondOrderStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Number of elements in the sequence
        int[] sequence = new int[n]; // Sequence of numbers

        // Read the sequence of numbers
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        // Find the second order statistics
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (sequence[i] < min) {
                secondMin = min;
                min = sequence[i];
            } else if (sequence[i] < secondMin && sequence[i] != min) {
                secondMin = sequence[i];
            }
        }

        // Output the result
        if (secondMin != Integer.MAX_VALUE) {
            System.out.println(secondMin);
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}

