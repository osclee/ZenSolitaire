package entity;

public class Card extends Entity {
    private final CardType cardType;
    public Card(CardType cardType) {
        super();
        this.cardType = cardType;
    }

    public CardType getCardType() {
        return cardType;
    }
}
