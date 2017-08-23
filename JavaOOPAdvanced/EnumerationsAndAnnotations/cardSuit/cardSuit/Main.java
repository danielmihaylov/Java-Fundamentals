package JavaOOPAdvanced.EnumerationsAndAnnotations.cardSuit.cardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        CardSuit[] suit = CardSuit.values();
        System.out.println("Card Suits:");
        for (CardSuit cardSuit : suit) {
            System.out.printf("Ordinal value: %s; Name value: %S\n",cardSuit.ordinal(),cardSuit);
        }
    }
}
