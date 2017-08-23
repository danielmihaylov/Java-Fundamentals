package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import static jdk.nashorn.internal.runtime.JSType.isNumber;

public class FindAndSumIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tokens = Arrays.asList(scanner.nextLine().split(" "));

        Optional<Integer> sum = tokens.stream()
                .filter(x -> isInteger(x))
                .map(x -> Integer.valueOf(x))
                .reduce((x,y)->x+y);
        if (sum.isPresent()){
            System.out.println(sum.get());
        }else{
            System.out.println("No match");
        }
    }

    private static boolean isInteger(String string) {
        if (string.isEmpty()){
            return false;
        }

        char[] character = string.toCharArray();
        for (int i = 0; i < character.length; i++) {
            if (i ==0){
                if (character[i] == '-' || character[i] == '+'){
                    continue;
                }
            }
            if (!Character.isDigit(character[i])){
                return false;
            }
        }
        return true;
    }
}
