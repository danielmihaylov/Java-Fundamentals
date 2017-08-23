package ManualStraingProcessing;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder reversed = new StringBuilder(scanner.nextLine());
        System.out.println(reversed.reverse());
    }
}
