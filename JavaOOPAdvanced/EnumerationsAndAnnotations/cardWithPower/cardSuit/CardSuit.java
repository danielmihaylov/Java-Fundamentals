package JavaOOPAdvanced.EnumerationsAndAnnotations.cardWithPower.cardSuit;

@EnumInfo(category = "Suit",Description = "Provides suit constants for a Card class.")
public enum CardSuit {

    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    CardSuit(int power) {
        this.setPower(power);
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
