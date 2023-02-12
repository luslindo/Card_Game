package com.company;

public class Card {

	public static final int heart = 0;
	public static final int club = 1;
	public static final int spade = 2;
	public static final int diamond = 3;
	public static final int Ace = 1;
	public static final int Jack = 11;
	public static final int Queen = 12;
	public static final int King = 13;

	private int suit;
	private int value;

	/**
	 * @param suit
	 * @param value
	 */
	public Card(int suit, int value) {
		this.suit = suit;
		this.value = value;
	}

	/**
	 * Represent the card as string for printing Now the cardGames.Card can be printed with
	 * println
	 */
	public String toString() {
		return   getSuitAsString()  + " "+getValueAsString() ;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @return the suit
	 */
	public int getSuit() {
		return suit;
	}

	/**
	 * @return a String representation of the Suit
	 */
	public String getSuitAsString(){
		if(getSuit()==spade){
			return "S";
		}
		else if (getSuit()==club){
			return "C";
		}
		else if (getSuit()==heart){
			return "H";
		}
		else if(getSuit()==diamond){
			return "D";
		}
		return "";
	}

	/**
	 * @return a String representaion of the Value
	 */
	public String getValueAsString(){
		if(getValue()==Ace){
			return "A";
		}
		else if(getValue()==King){
			return "K";
		}
		else if (getValue()==Queen){
			return "Q";
		}
		else if(getValue()==Jack){
			return "J";
		}
		return ""+getValue();
	}


}
