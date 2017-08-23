package JavaSyntax;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer x1 = scanner.nextInt();
        Integer y1 = scanner.nextInt();
        Integer x2 = scanner.nextInt();
        Integer y2 = scanner.nextInt();
        Integer x3 = scanner.nextInt();
        Integer y3 = scanner.nextInt();
        Integer area = calcArea(x1,x2,x3,y1,y2,y3);
        System.out.println(area);
    }

    private static Integer calcArea(Integer x1, Integer x2, Integer x3, Integer y1, Integer y2, Integer y3) {
        return Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2;
    }
}
