package entity;

public enum CardType {
    CLUBS_ACE("clubs_ace"),
    CLUBS_TWO("clubs_two"),
    CLUBS_THREE("clubs_three"),
    CLUBS_FOUR("clubs_four"),
    CLUBS_FIVE("clubs_five"),
    CLUBS_SIX("clubs_six"),
    CLUBS_SEVEN("clubs_seven"),
    CLUBS_EIGHT("clubs_eight"),
    CLUBS_NINE("clubs_nine"),
    CLUBS_TEN("clubs_ten"),
    CLUBS_JACK("clubs_jack"),
    CLUBS_QUEEN("clubs_queen"),
    CLUBS_KING("clubs_king"),
    DIAMONDS_ACE("diamonds_ace"),
    DIAMONDS_TWO("diamonds_two"),
    DIAMONDS_THREE("diamonds_three"),
    DIAMONDS_FOUR("diamonds_four"),
    DIAMONDS_FIVE("diamonds_five"),
    DIAMONDS_SIX("diamonds_six"),
    DIAMONDS_SEVEN("diamonds_seven"),
    DIAMONDS_EIGHT("diamonds_eight"),
    DIAMONDS_NINE("diamonds_nine"),
    DIAMONDS_TEN("diamonds_ten"),
    DIAMONDS_JACK("diamonds_jack"),
    DIAMONDS_QUEEN("diamonds_queen"),
    DIAMONDS_KING("diamonds_king"),
    HEARTS_ACE("hearts_ace"),
    HEARTS_TWO("hearts_two"),
    HEARTS_THREE("hearts_three"),
    HEARTS_FOUR("hearts_four"),
    HEARTS_FIVE("hearts_five"),
    HEARTS_SIX("hearts_six"),
    HEARTS_SEVEN("hearts_seven"),
    HEARTS_EIGHT("hearts_eight"),
    HEARTS_NINE("hearts_nine"),
    HEARTS_TEN("hearts_ten"),
    HEARTS_JACK("hearts_jack"),
    HEARTS_QUEEN("hearts_queen"),
    HEARTS_KING("hearts_king"),
    SPADES_ACE("spades_ace"),
    SPADES_TWO("spades_two"),
    SPADES_THREE("spades_three"),
    SPADES_FOUR("spades_four"),
    SPADES_FIVE("spades_five"),
    SPADES_SIX("spades_six"),
    SPADES_SEVEN("spades_seven"),
    SPADES_EIGHT("spades_eight"),
    SPADES_NINE("spades_nine"),
    SPADES_TEN("spades_ten"),
    SPADES_JACK("spades_jack"),
    SPADES_QUEEN("spades_queen"),
    SPADES_KING("spades_king");

    private final String name;

    CardType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
