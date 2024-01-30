package CRT;

import java.util.*;

public class Unique_nmbrs {
    public static void printUniqueNumbers(int[] arr, int n, int k) {
        

        for (int i = 0; i <= n - k; i++) {
            HashSet<Integer> uniqueSet = new HashSet<>();

           
            for (int j = i; j < i + k; j++) {
                uniqueSet.add(arr[j]);
            }

           System.out.print(uniqueSet.size());
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 3, 4, 5};
        int n = arr.length;
        int k = 3;

        printUniqueNumbers(arr, n, k);
    }
}

