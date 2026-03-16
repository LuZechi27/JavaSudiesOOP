package ConceitosIniciaisOOP.Exercicios.ExCards;

public class Card {
    public enum Suit {SPADES, HEARTS, CLUBS, DIAMONDS}
    public enum Rank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, KING, QUEEN, JACK}

    private final Suit suit;
    private final Rank rank;
    private boolean isVisible;

    public Card(Suit suit, Rank rank, boolean isVisible) {
        this.suit = suit;
        this.rank = rank;
        this.isVisible = isVisible;
    }

    private String getSuitName(Suit suit) {
        return switch (suit) {
            case CLUBS -> "Paus";
            case HEARTS -> "Copas";
            case SPADES -> "Espadas";
            case DIAMONDS -> "Ouros";
        };
    }

    private String getRankName(Rank rank) {
        return switch (rank) {
            case ACE -> "Ás";
            case TWO -> "2";
            case THREE -> "3";
            case FOUR -> "4";
            case FIVE -> "5";
            case SIX -> "6";
            case SEVEN -> "7";
            case EIGHT -> "8";
            case NINE -> "9";
            case TEN -> "10";
            case JACK -> "Valete";
            case KING -> "Rei";
            case QUEEN -> "Dama";
        };
    }

    public String showStatus() {
        if (isVisible) {
            return "A carta está visivel.\n" +
                    "Naipe: " + getSuitName(suit) + "\n" +
                    "Valor: " + getRankName(rank) + "\n";
        } else {
            return "A carta está encoberta e não é possível ver seu naipe e valor.\n";
        }
    }

    public void flipCard() {
        isVisible = !isVisible;
    }
}