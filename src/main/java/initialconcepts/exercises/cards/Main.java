package initialconcepts.exercises.cards;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Card.Suit[] suits = Card.Suit.values();
        final Card.Rank[] ranks = Card.Rank.values();

        final int size = ranks.length * suits.length;
        final Card[] cards = new Card[size];

        int index = 0;
        for (Card.Rank rank : ranks) {
            for (Card.Suit suit : suits) {
                cards[index] = new Card(suit, rank);
                cards[index].flipCard();
                index++;
            }
        }
        System.out.println("\n------Todas as cartas-----------\n");
        System.out.println(cards.length);
        int cardNumber = 1;
        for (Card card : cards) {
            System.out.println("Numero: " + cardNumber);
            System.out.println(card.showStatus());
            cardNumber++;
        }
        System.out.println("Enter para continuar...");
        scanner.nextLine();

        System.out.println("\n--------Deck-----------\n");
        final Deck deck = new Deck();

        for (Card card : cards) {
            deck.addCard(card);
        }

        System.out.println("Carta do deck:\n" + deck.pickOneCard().showStatus());

        Card deckCard = deck.pickOneCard();
        deckCard.flipCard();
        System.out.println("Outra carta do deck:\n" + deckCard.showStatus());

        System.out.println("Várias cartas aleatórias:\n");
        for (Card card : deck.pickCards(3)) {
            System.out.println(card.showStatus());
        }
        System.out.println("Enter para continuar...");
        scanner.nextLine();

        System.out.println("Mais cartas aleatórias:\n");
        System.out.print("Numero de cartas: ");
        int number = scanner.nextInt();

        for (Card card : deck.pickCards(number)) {
            int flipOrNot = (int) (Math.random() * 100);
            if (flipOrNot < 50)
                card.flipCard();
            System.out.println(card.showStatus());
        }
        System.out.println("Enter para continuar...");
        scanner.nextLine();
        scanner.nextLine();

        System.out.println("Deck final:\n");
        System.out.println("Quantidade de cartas: " + deck.getCardAmount());
        System.out.println("Cartas:\n");
        Card[] deckCards = deck.getCards();
        for (int i = 0; i < deck.getCardAmount(); i++) {
            System.out.printf("Carta %d:\n", i + 1);
            System.out.println(deckCards[i].showStatus());
        }
    }
}
