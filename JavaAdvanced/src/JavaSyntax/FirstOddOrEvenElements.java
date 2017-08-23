package JavaSyntax;

import java.util.Scanner;

public class FirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().trim().split(" ");
        String[] commands = scanner.nextLine().trim().split(" ");

        long[] numbers = new long[nums.length];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]= Integer.parseInt(nums[i]);
        }
        long numOfElements = Integer.parseInt(commands[1]);
        String type = commands[2];

        if (type.toLowerCase().equals("odd")){
            printMatches(numbers,numOfElements,1);
        }else{
            printMatches(numbers,numOfElements,0);
        }
    }
    private static void printMatches(long[] numbers,long numOfElements,long type){
        for (int i = 0; i <numbers.length ; i++) {
            if (numOfElements==0){
                break;
            }
            if (numbers[i]%2 == type){
                numOfElements--;
                System.out.print(numbers[i] + " ");
            }
        }
    }
}