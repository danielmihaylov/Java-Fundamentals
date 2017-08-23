package JavaSyntax;

import java.util.Scanner;

public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int num = Integer.valueOf(number,7);
        System.out.println(num);
    }
}