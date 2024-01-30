package Atcoder;
import java.util.Scanner;

public class Players {
    static int N, M, T;
    static int[] teamAssignments;
    static int[][] incompatiblePairs;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();  
        M = scanner.nextInt();
        T = scanner.nextInt(); 

        teamAssignments = new int[N + 1];  
        incompatiblePairs = new int[M][2]; 

        for (int i = 0; i < M; i++) {
            incompatiblePairs[i][0] = scanner.nextInt();
            incompatiblePairs[i][1] = scanner.nextInt();
        }

        int count = countValidDivisions(1);  // Start with player 1
        System.out.println(count);
    }

    static int countValidDivisions(int player) {
        if (player == N + 1) {
            return 1;
        }

        int count = 0;

        for (int team = 1; team <= T; team++) {
            boolean isValid = true;

            for (int i = 1; i < player; i++) {
                if (teamAssignments[i] == team && isPairIncompatible(i, player)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                teamAssignments[player] = team;
                count += countValidDivisions(player + 1);
                teamAssignments[player] = 0;  // Reset assignment for backtracking
            }
        }

        return count;
    }

    static boolean isPairIncompatible(int player1, int player2) {
        for (int i = 0; i < M; i++) {
            if ((incompatiblePairs[i][0] == player1 && incompatiblePairs[i][1] == player2) ||
                    (incompatiblePairs[i][0] == player2 && incompatiblePairs[i][1] == player1)) {
                return true;
            }
        }
        return false;
    }
}

