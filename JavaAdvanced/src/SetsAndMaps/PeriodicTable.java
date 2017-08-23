package SetsAndMaps;

import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TreeSet<String> result = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String [] elements = scanner.nextLine().split(" ");
            for (String element : elements) {
                result.add(element);
            }
        }
        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}