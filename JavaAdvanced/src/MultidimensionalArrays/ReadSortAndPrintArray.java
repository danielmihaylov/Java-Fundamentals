package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] text = new String[n];
        for (int i = 0; i < text.length ; i++) {
            text[i] = scanner.nextLine();
        }
        Arrays.sort(text);
        for (String name : text) {
            System.out.println(name);
        }
    }
}