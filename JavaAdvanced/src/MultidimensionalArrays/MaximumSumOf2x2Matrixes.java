package MultidimensionalArrays;

import java.util.Scanner;

public class MaximumSumOf2x2Matrixes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int [][] nums = new int [Integer.parseInt(input[0])][Integer.parseInt(input[1])];

        for (int row = 0; row < nums.length; row++) {
            String[] reminder = scanner.nextLine().split(", ");
            for (int col = 0; col < nums[row].length; col++) {
                nums[row][col] = Integer.parseInt(reminder[col]);
            }
        }

        int sumMax = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;
        for (int row = 0; row < nums.length-1; row++) {
            for (int col = 0; col < nums[row].length-1; col++) {
                int currSum = nums[row][col]+
                        nums[row][col+1]+
                        nums[row+1][col]+
                        nums[row+1][col+1];
                if (currSum > sumMax){
                    sumMax = currSum;
                    startRow = row;
                    startCol = col;
                }
            }
        }
        System.out.println(nums[startRow][startCol] + " " + nums[startRow][startCol+1]);
        System.out.println(nums[startRow+1][startCol] + " " + nums[startRow+1][startCol+1]);
        System.out.println(sumMax);
    }
}