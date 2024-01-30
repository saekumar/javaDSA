package Codeforces;

import java.util.*;

public class Sol {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            Arrays.sort(arr);
            
            int firstIndex = 0;
            int lastIndex = n - 1;
            int half = n / 2;
            int answer = 0;
            
            while (half > 0) {
                int left = arr[firstIndex];
                int right = arr[lastIndex];
                int difference = right - left;
                answer += difference;
                half--;
                firstIndex++;
                lastIndex--;
            }
            
            System.out.println(answer);
            
            t--;
        }
        
        sc.close();
    }
}
