package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split(" ");
        Predicate<String> lengthCheck = s->s.length() <= number;
        ArrayList<String> result = new ArrayList<>();
        for (String name : names) {
           if (lengthCheck.test(name)){
               result.add(name);
           }
        }
        for (String s : result) {
            System.out.println(s);
        }
    }
}
