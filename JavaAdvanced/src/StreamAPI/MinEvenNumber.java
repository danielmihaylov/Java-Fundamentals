package StreamAPI;

import java.util.*;
import java.util.stream.Stream;

public class MinEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tokens = Arrays.asList(scanner.nextLine().split("\\s+"));
        OptionalDouble min = tokens.stream()
                .filter(s ->!s.isEmpty())
                .mapToDouble(s -> Double.valueOf(s))
                .filter(s -> s % 2 ==0)
                .min();
        if (min.isPresent()){
            System.out.printf("%.2f",min.getAsDouble());
        }else{
            System.out.println("No match");
        }
    }
}
