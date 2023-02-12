package com.company; /**
 * 
 */

/**
 * @author anban
 *
 */
public class Hand {
	private Card[] hand;
	Deck de = new Deck();
	
	//creates a hand to hold 52 cards
	public Hand() {
		hand =new Card[52];
	}
	
	//create a hand to hold num cards
	public Hand(int num) {
		hand = new Card[num];
	}
	
	//add a card to this hand
	int count=0;
	public void addCard() {
		if(count<hand.length) {
			hand[count++] = de.dealCard();
		}
	}

	//remove the card at index i from this hand
	public void removeCard(int i) {
			hand[i] = null;

	}
	
	//return the value of the cards in this hand
	public int value() {
		int sum =0;
		for (Card i:hand) {
			if(i.getValue()==8){
				sum+=50;
			}
			else if(i.getValue()==11||i.getValue()==12||i.getValue()==13){
				sum+=10;
			}
			else{
				sum+=i.getValue();
			}
		}
		 return sum;
	}
	
}
