package StacksAndQueues;

import java.util.*;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] commands = scanner.nextLine().split(" ");
        int[] elements = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int minValue = Integer.MAX_VALUE;
        int pops = Integer.parseInt(commands[1]);
        int maxNumber = Integer.parseInt(commands[2]);
        Stack<Integer> minNumber = new Stack<>();
        Stack<Integer> numbers = new Stack<>();
        Stack<Integer> result = new Stack<>();
        for (int element : elements) {
            if (element <= minValue){
                minValue=element;
                minNumber.push(element);
            }
        }
        for (int i = 0; i < minNumber.size(); i++) {
            if (minNumber.get(i) <= minValue){
                minValue=minNumber.get(i);
            }
        }

        for (int element : elements) {
            numbers.push(element);
        }
        while (!numbers.isEmpty()){
            int reversed = numbers.pop();
            result.push(reversed);
        }

        for (int i = 0; i <pops ; i++) {
            result.pop();
        }


        if (result.contains(maxNumber)){
            System.out.println(true);
        }else if(result.isEmpty()){
            System.out.println(0);
        } else{
            System.out.println(minValue);
        }

    }
}