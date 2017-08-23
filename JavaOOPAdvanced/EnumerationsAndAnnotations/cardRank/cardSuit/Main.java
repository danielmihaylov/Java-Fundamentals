package JavaOOPAdvanced.EnumerationsAndAnnotations.cardRank.cardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        CardRank[] rank = CardRank.values();
        System.out.println("Card Ranks:");
        for (CardRank cardRank : rank) {
            System.out.printf("Ordinal value: %s; Name value: %s\n",cardRank.ordinal(),cardRank);
        }
//        CardSuit[] suit = CardSuit.values();
//        System.out.println("Card Suits:");
//        for (CardSuit cardSuit : suit) {
//            System.out.printf("Ordinal value: %s; Name value: %S\n",cardSuit.ordinal(),cardSuit);
//        }
    }
}
