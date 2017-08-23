package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i : intArray) {
            if (i % 2 == 0){
                even.add(i);
            }else{
                odd.add(i);
            }
        }
        even.sort((x1,x2)->x1.compareTo(x2));
        odd.sort((x1,x2)->x1.compareTo(x2));
        for (Integer integer : even) {
            System.out.print(integer + " ");
        }
        for (Integer integer : odd) {
            System.out.print(integer + " ");
        }
    }
}
