package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class ReversingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Stack<Character> reversed = new Stack<>();
        for (Character ch : input.toCharArray()) {
            reversed.push(ch);
        }
        while (!reversed.isEmpty()){
            System.out.print(reversed.pop());
        }
    }
}