package JavaOOPAdvanced.EnumerationsAndAnnotations.cardRank.cardSuit;

public enum CardSuit {

    CLUBS(0),
    DIAMONDS(1),
    HEARTS(2),
    SPADES(3);

    private int power;

    CardSuit(int power) {
        this.power = power;
    }
}
