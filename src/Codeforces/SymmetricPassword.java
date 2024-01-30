package Codeforces;

import java.util.Scanner;

public class SymmetricPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input matrix
        char[][] matrix = new char[3][3];
        for (int i = 0; i < 3; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = line.charAt(j);
            }
        }

        // Check if the password is symmetric
        boolean symmetric = true;
        if (matrix[0][0] != matrix[2][2] || matrix[0][2] != matrix[2][0]) {
            symmetric = false;
        }

        // Output the result
        if (symmetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
