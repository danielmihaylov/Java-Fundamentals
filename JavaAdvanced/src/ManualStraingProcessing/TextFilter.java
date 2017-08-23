package ManualStraingProcessing;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Arrays;
import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
       // StringBuilder sb = new StringBuilder();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                sb.append("*");
            }
            text = text.replace(word,sb);
        }
        System.out.println(text);
    }
}
