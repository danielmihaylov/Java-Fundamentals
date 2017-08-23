package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        String command = scanner.nextLine();

        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int i = a; i <=b ; i++) {
            if (i % 2 == 0){
                even.append(i).append(" ");
            }else{
                odd.append(i).append(" ");
            }
        }
        if (command.equals("odd")){
            System.out.print(odd.toString());
        }else{
            System.out.print(even.toString());
        }
    }
}
