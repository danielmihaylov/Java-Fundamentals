package StreamAPI;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BoundedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> bounds = Stream.of(scanner.nextLine().split("\\s+"))
                .map(Integer::valueOf)
                .sorted()
                .collect(Collectors.toList());

        Stream.of(scanner.nextLine().split("\\s+"))
                .map(Integer::valueOf)
                .filter(x-> bounds.get(0) <= x && x<= bounds.get(1))
                .forEach(x-> System.out.print(x + " "));
        }
    }
