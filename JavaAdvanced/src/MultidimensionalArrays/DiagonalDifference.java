package MultidimensionalArrays;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                String inputNumber = scanner.next();
                matrix[row][column] = Integer.parseInt(inputNumber);
            }
        }
        int mainDiagonal = 0;
        int secondDiagonal = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i==j){
                    mainDiagonal+= matrix[i][j];
                }
                if (i+j == size-1){
                    secondDiagonal += matrix[i][j];
                }
            }
        }
        System.out.println(Math.abs(mainDiagonal-secondDiagonal));
    }
}