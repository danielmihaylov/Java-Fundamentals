package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] intArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <intArray.length ; i++) {
            if (intArray[i] < min){
                min = intArray[i];
            }
        }
        System.out.println(min);
    }
}
