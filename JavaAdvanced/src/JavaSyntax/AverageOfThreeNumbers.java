package JavaSyntax;

import java.util.Scanner;

/**
 * Created by Daniel on 23.8.2017 г..
 */
public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double first = scanner.nextDouble();
        Double second = scanner.nextDouble();
        Double third = scanner.nextDouble();

        Double average = (first+second+third)/3;
        System.out.printf("%.2f",average);
    }
}
