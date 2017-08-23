package StreamAPI;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class UpperStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");
        Stream<String> stream = Arrays.stream(text);
        stream.map(x -> x.toUpperCase())
                .forEach(x -> System.out.print(x + " "));
    }
}
