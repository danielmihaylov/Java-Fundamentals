package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(" ");
        String[] commands = scanner.nextLine().split(" ");
        String command = commands[0];
        String criteria = commands[1];
        String length = commands[2];
        List<String> result = new ArrayList<>();
        while (!command.equals("Party!")){
            command = scanner.nextLine();
            for (String name : names) {
                if (command.equals("Remove")){
                    if (criteria.equals("StartsWith")){
                        if (name.startsWith(length)){

                        }
                    }
                }
            }
        }
    }
}
