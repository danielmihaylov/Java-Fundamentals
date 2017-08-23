package StacksAndQueues;

import java.util.*;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] commands = scanner.nextLine().split(" ");
        int[] elements = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //int elements = Integer.parseInt(scanner.nextLine());
        //String[] elements = scanner.nextLine().split(" ");
        int minValue = Integer.MAX_VALUE;
        int pushes = Integer.parseInt(commands[0]);
        int pops = Integer.parseInt(commands[1]);
        int maxNumber = Integer.parseInt(commands[2]);
        Stack<Integer> minNumber = new Stack<>();
        Stack<Integer> numbers = new Stack<>();
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
        //for (int i = 0; i < pushes; i++) {
        // numbers.push(i);
        //}
        for (int i = 0; i <pops ; i++) {
            numbers.pop();
        }

        if (numbers.contains(maxNumber)){
            System.out.println(true);
        }else if(numbers.isEmpty()){
            System.out.println(0);
        } else{
            System.out.println(minValue);
        }

    }
}