package JavaOOPAdvanced.EnumerationsAndAnnotations.cardDeck.cardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        CardRank[] rank = CardRank.values();
        CardSuit[] suit = CardSuit.values();

            for (CardSuit cardSuit : suit) {
                for (CardRank cardRank : rank) {
                System.out.printf("%s of %s\n",cardRank,cardSuit);
            }
            //System.out.printf("Ordinal value: %s; Name value: %s\n",cardRank.ordinal(),cardRank);
            //System.out.printf("Ordinal value: %s; Name value: %S\n",cardSuit.ordinal(),cardSuit);
        }
    }
}
