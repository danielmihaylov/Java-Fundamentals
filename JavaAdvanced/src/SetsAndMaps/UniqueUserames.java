package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUserames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<String> result = new LinkedHashSet<>();
        for (int i = 0; i < lines ; i++) {
            String names = scanner.nextLine();
            result.add(names);
        }
        for (String s : result) {
            System.out.println(s);
        }
    }
}