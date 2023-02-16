import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand {

	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand (Card[] cards) {

		for(int i = 0;i < cards.length; ++i) {
			this.cards.add(cards[i]);
		}
		
	}
	
	public int size() {
		
		return cards.size();
	}
	
	public Card getCard(int index) {
		return cards.get(index);
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public Card playCard(int index) {	
		
		return cards.remove(index);
	}
	
	
	public void sort() {
		Collections.sort(cards, Comparator.comparing(Card::getRank));
		Collections.sort(cards, Comparator.comparing(Card::getSuit));

	}
	
	public boolean isSorted() {
		
		ArrayList<Card> copy = new ArrayList<Card>(cards);
		Collections.sort(cards, Comparator.comparing(Card::getRank));
		Collections.sort(cards, Comparator.comparing(Card::getSuit));

		return copy.equals(cards);
		
	}
	
	public String toString() {
		return cards.toString();
	}
	
	
}
