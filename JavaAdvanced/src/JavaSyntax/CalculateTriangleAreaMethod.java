package JavaSyntax;

import java.util.Scanner;

public class CalculateTriangleAreaMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double height = scanner.nextDouble();
        Double width = scanner.nextDouble();
        Double area = calculateTriangle(height,width);
        System.out.printf("Area = %.2f",area);
    }

    private static Double calculateTriangle(Double height, Double width) {
        return height*width/2;
    }
}

