package SetsAndMaps;

import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        TreeMap<Character ,Integer> result = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (!result.containsKey(current)){
                result.put(current,1);
            }else{
                result.put(current,result.get(current)+1);
            }
        }
        for (Character character : result.keySet()) {
            System.out.println(character + ": " + result.get(character) + " time/s");
        }
    }
}
