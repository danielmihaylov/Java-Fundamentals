package ManualStraingProcessing;

import java.util.Scanner;

public class UnicodeCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (Character s : word.toCharArray()) {
            sb.append("\\u").append(String.format("%04x",(int) s));
        }
        System.out.println(sb);
    }
}
