package Codeforces;


import java.util.Arrays;
import java.util.Scanner;

public class Man_become_god {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int[] ar = new int[n - 1];
            for (int i = 1; i < n; i++) {
                ar[i - 1] = Math.abs(arr[i] - arr[i - 1]);
            }
            Arrays.sort(ar);
            int sum = 0;
            for (int i = 0; i < n - k; i++) {
                sum += ar[i];
            }
            System.out.println(sum);
        }
    }
}

