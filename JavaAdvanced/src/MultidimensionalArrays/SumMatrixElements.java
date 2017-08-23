package MultidimensionalArrays;

import java.util.Scanner;

public class SumMatrixElements {
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

        System.out.println(nums.length);
        System.out.println(nums[0].length);
        int sum = 0;
        for (int[] num : nums) {
            for (int i : num) {
                sum+= i;
            }
        }
        System.out.println(sum);
    }
}