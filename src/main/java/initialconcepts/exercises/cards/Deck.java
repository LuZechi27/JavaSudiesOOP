package initialconcepts.exercises.cards;

public class Deck {
    final private int SIZE = 52;
    final private Card[] cards = new Card[SIZE];
    private int cardAmount;

    public Deck() {
        cardAmount = 0;
    }

    public int getCardAmount() {
        return cardAmount;
    }

    public Card[] getCards() {
        return cards;
    }

    public void addCard(Card card) {
        cards[cardAmount++] = card;
    }

    public Card pickOneCard() {
        int index = --cardAmount;
        Card cardChoosed = cards[index];
        cards[index] = null;
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
