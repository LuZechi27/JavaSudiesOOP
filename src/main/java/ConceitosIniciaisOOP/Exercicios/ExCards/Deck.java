package ConceitosIniciaisOOP.Exercicios.ExCards;

public class Deck {
    private final Card[] cards;
    private final int size;
    private int cardAmount;

    public Deck(Card[] cards, int size) {
        this.cards = cards;
        this.size = size;
        cardAmount = size;
    }

    public int getCardAmount() {
        return cardAmount;
    }

    public Card[] getCards() {
        return cards;
    }

    public Card pickOneCard() {
        Card cardChoosed;
        int random;
        do {
            random = (int) (Math.random() * (size - 1));
            cardChoosed = cards[random];
        } while (cardChoosed == null);

        cardAmount--;
        cards[random] = null;
        return cardChoosed;
    }

    public Card[] pickCards(int amount) {
        Card[] cardsPicked = new Card[amount];
        for (int i = 0; i < amount; i++) {
            cardsPicked[i] = pickOneCard();
        }
        return cardsPicked;
    }
}
