package JavaOOPAdvanced.EnumerationsAndAnnotations.cardDeck.cardSuit;

public class Card implements Comparable<Card>{

    private CardRank rank;
    private CardSuit suit;
    private int power;

    public Card(CardRank rank, CardSuit suit) {
        this.rank = rank;
        this.suit = suit;
        this.setPower();
    }

    public int getPower() {
        return this.power;
    }

    public void setPower() {
        this.power = this.rank.getPower() + this.suit.getPower();
    }


    @Override
    public int compareTo(Card otherCard) {
        return Integer.compare(this.getPower(),otherCard.getPower());
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                this.rank.name(),
                this.suit.name(),
                this.getPower());
    }
}
