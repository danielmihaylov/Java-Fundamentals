package MultidimensionalArrays;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer r = scanner.nextInt();
        Integer c = scanner.nextInt();
        int[][] matrix = new int[r][c];
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%s%s%s",alphabet[i],alphabet[i+j],alphabet[i] + " ");;
            }
            System.out.println();
        }
    }
}