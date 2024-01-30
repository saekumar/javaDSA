package Codeforces;

import java.util.Scanner;

public class ROTKCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        for (int q = 0; q < queries; q++) {
            int length = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            String original = scanner.nextLine();
            String cipher = scanner.nextLine();
            String target = scanner.nextLine();

            int shift = getShift(original, cipher);
            String result = applyROT(target, shift);
            System.out.println(result);
        }
    }

    private static int getShift(String original, String cipher) {
        int length = original.length();
        for (int i = 0; i < length; i++) {
            char originalChar = original.charAt(i);
            char cipherChar = cipher.charAt(i);
            int diff = cipherChar - originalChar;

            // Since the shift is circular, we need to handle cases when the shift is negative
            if (diff < 0) {
                diff += 26; // 26 is the number of lowercase English alphabets
            }

            if (diff != 0) {
                return diff;
            }
        }
        return 0; // If both strings are the same, the shift is 0
    }

    private static String applyROT(String str, int shift) {
        StringBuilder result = new StringBuilder();
        int length = str.length();

        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            char shifted = (char) (((c - 'a' + shift) % 26) + 'a');
            result.append(shifted);
        }

        return result.toString();
    }
}

