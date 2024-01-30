package Codeforces;
import java.util.*;

class Subtraction {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long sai = sc.nextLong();
            long array[] = new long[(int) sai];
            array[0] = 2;
            array[(int) (sai - 1)] = 3;
            array[(int) (sai / 2)] = 1;
            long kumar = 4;
            for (int i = 0; i < sai; i++) {
                if (i == sai / 2 || i == 0 || i == sai - 1) {
                    continue;
                }
                array[i] = kumar++;
            }
            for (int i = 0; i < sai; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
