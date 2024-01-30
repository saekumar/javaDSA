package Atcoder;
import java.util.*;


public class Stringequal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        Set<String> uniqueSticks = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String Si = scanner.nextLine();
            String reversedSi = new StringBuilder(Si).reverse().toString();

            if (!uniqueSticks.contains(Si) && !uniqueSticks.contains(reversedSi)) {
                uniqueSticks.add(Si);
            }
        }

        System.out.println(uniqueSticks.size());
    }
}
