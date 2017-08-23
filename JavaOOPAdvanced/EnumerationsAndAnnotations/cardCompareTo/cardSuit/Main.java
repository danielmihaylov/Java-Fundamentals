package JavaOOPAdvanced.EnumerationsAndAnnotations.cardCompareTo.cardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rank = scanner.nextLine();
        String suit = scanner.nextLine();
        CardRank rank1 = CardRank.valueOf(rank);
        CardSuit suit1 = CardSuit.valueOf(suit);


        System.out.printf("Card name: %s of %s; Card power: %d",rank,suit,rank1.getPower() + suit1.getPower());

    }
}
