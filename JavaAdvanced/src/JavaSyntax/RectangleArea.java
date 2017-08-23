package JavaSyntax;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        Double area = calcArea(a, b);
        System.out.printf("%.2f", area);
    }

    private static Double calcArea(Double a, Double b) {
        return a * b;
    }
}