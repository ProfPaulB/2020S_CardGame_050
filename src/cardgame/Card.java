package cardgame;

public class Card {

    private int value;
    private String suit;
    
    public static final String[] SUITS = 
        {"Hearts", "Diamonds", "Spades", "Clubs"};

    public int getValue() {
        return this.value;
    }

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    /**
     * 
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return this.suit;
    }

    /**
     * 
     * @param suit
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

}