// Worked on this class with Guillermo, Keeton, and John

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList <Card> cards;
	
	public Deck() {
		Rank[] rTemp = Rank.values();
		Suit[] sTemp = Suit.values();
		
		Card cTemp;
		cards = new ArrayList<Card>();
		for(int i = 0; i < sTemp.length; ++i) {
			for(int j = 0; j < rTemp.length; ++j) {
				cTemp = new Card(rTemp[j], sTemp[i]);
				cards.add(cTemp);
			}
		}
	}
	
	public Deck(Card[] cards) {
		this.cards = new ArrayList<Card>();
		for(int i = 0; i <cards.length; ++i) {
			this.cards.add(cards[i]);
		}
		
	}
	
	protected ArrayList<Card> getCards(){ // helper method for the copy constructor 
		return cards;
	}

	public Deck(Deck deck) {
		
		ArrayList<Card> copy = deck.getCards() ;
		ArrayList<Card> temp = new ArrayList<Card>();
		
		for(int i = 0; i < copy.size(); ++i) {
			temp.add(copy.get(i));
		}
		cards = temp;
	}
	
	public int size() {
		int cardSize = cards.size();
		return cardSize;
	}
	
	public Card draw() {
		if(cards.size() == 0) {
			return null;
		}
		Card tempCard = cards.get(0);
		cards.remove(0);
		return tempCard;
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	
	public ArrayList<Card> getCardsByRank (Rank rank){
		ArrayList<Card> temp = new ArrayList<Card>();
		Suit[] sTemp = Suit.values();
		for(int i =0; i < 4; ++i) {
			temp.add(new Card(rank, sTemp[i]));
		}
		return temp;
	}
	
	public String toString() {
		if(cards.size() == 0) {
			return "[]";
		}
		String temp = "";
		for(int i = 0; i < cards.size() - 1; ++i) {
			temp =  temp + cards.get(i).toString() + ", ";
		}
		temp = "[" + temp + cards.get(cards.size() - 1).toString() + "]";
		return temp;
	}
	
	
	
}
