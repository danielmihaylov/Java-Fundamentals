package ManualStraingProcessing;

import java.util.Scanner;

public class CountSubstringOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        String word = scanner.nextLine().toLowerCase();
        int counter = 0;
        while (text.contains(word)){
            counter++;
            text = text.substring(text.indexOf(word)+word.length());
        }
        System.out.println(counter);
    }
}
