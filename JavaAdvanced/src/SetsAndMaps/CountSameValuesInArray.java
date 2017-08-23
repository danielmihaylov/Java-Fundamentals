package SetsAndMaps;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class CountSameValuesInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        HashMap<String, Integer> result = new HashMap<>();
        for (String number : input) {
            if (!result.containsKey(number)) {
                result.put(number, 1);
            } else {
                result.put(number, result.get(number) + 1);
            }
        }
        for (String key : result.keySet()) {
            System.out.println(key + " - " + result.get(key) + " times");
        }

    }
}
