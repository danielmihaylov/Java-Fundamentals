package FunctionalProgramming;

import java.util.*;

import java.util.function.Function;


public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int min = Integer.MAX_VALUE;
        if (intArray.length >=0){
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i <intArray.length ; i++) {
                result.add(intArray[i]);
                if (min > intArray[i]){
                    min = intArray[i];
                }
            }
            for (Integer integer : result) {
                if (integer == min){
                    System.out.println(result.indexOf(integer));
                }
            }
        }
    }
}
