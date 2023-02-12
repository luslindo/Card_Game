package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Card card = new Card(1, 2);
        Deck deck = new Deck();

        Hand player1 = new Hand(7);
        Hand player2 = new Hand(7);

        deck.shuffle();
        for (int i = 0; i < 7; i++) {

            player1.addCard();
            player2.addCard();
        }

        deck.flip();
        int value =deck.cardsLeft();
        int cardvalue = deck.dealCard().getValue();


    }
}
