package FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        for (String s : input) {
            Consumer<String> print = x -> System.out.println(s.toString());
            print.accept(s);
        }
    }
}
