package StacksAndQueues;
import java.util.*;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moves = Integer.parseInt(scanner.nextLine());
        Deque<Integer> someNumbers = new ArrayDeque<>();
        Deque<Integer> maxNumber = new ArrayDeque<>();
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < moves; i++) {
            String[] commands = scanner.nextLine().split(" ");
            int command = Integer.parseInt(commands[0]);
            switch (command){
                case 1:
                    int number = Integer.parseInt(commands[1]);
                    if (number>=maxValue){
                        maxValue=number;
                        maxNumber.push(maxValue);
                    }
                    someNumbers.push(number);
                    break;
                case 2:
                    int deletedItems = someNumbers.pop();
                    if (deletedItems == maxValue){
                        maxNumber.pop();
                        if (!maxNumber.isEmpty()){
                            maxValue = maxNumber.peek();
                        }else{
                            maxValue = Integer.MIN_VALUE;
                        }
                    }
                    break;
                case 3:
                    System.out.println(maxNumber.peek());
                    break;
            }
        }
    }
}