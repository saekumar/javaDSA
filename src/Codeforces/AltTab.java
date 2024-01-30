package Codeforces;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class AltTab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<String> programs = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String program = scanner.next();
            programs.add(program);
        }

        Set<String> uniquePrograms = new LinkedHashSet<>(programs);

        StringBuilder output = new StringBuilder();
        for (String program : uniquePrograms) {
            output.append(program.substring(program.length() - 2));
        }

        System.out.println(output.toString());
    }
}
