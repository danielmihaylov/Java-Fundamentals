package FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            Consumer<String> print = x-> System.out.printf("Sir " + s + "%n");
            print.accept(s);
        }

    }
}
