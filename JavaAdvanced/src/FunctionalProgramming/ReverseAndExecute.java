package FunctionalProgramming;

import java.util.*;

public class ReverseAndExecute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int divider = Integer.parseInt(scanner.nextLine());
        //StringBuilder result = new StringBuilder();
        Stack<Integer> result = new Stack<>();
        for (int i = 0; i < intArray.length ; i++) {
            if (intArray[i] % divider != 0){
                //result.append(intArray[i]).append(" ");
                result.add(intArray[i]);
            }
        }
        //result.reverse();
        //System.out.print(result.toString().trim());
        while (!result.isEmpty()){
            System.out.print(result.pop() + " ");
        }
    }
}
