package MultidimensionalArrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class SquaresInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer r = scanner.nextInt();
        Integer c = scanner.nextInt();
        String[][] matrix = new String[r][c];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.next();
            }
        }
        int counter = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j].equals(matrix[i][j + 1]) && matrix[i][j].equals(matrix[i + 1][j]) && matrix[i][j].equals(matrix[i + 1][j + 1])) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}