// Worked on this class with Guillermo, Keeton, and John

public class Card {

	
	private Rank rank;
	private Suit suit;
	
	public Card(Rank rank, Suit suit) {
		
		if(rank == null || suit == null) {
			throw new NullPointerException();
		}
		
		this.rank = rank;
		this.suit = suit;
	}
	
	public Rank getRank(){
		return rank;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public int compareTo(Card card) {
		
		if(suit.compareTo(card.getSuit())== 0) {
			return rank.compareTo(card.getRank());
		}
		
		else
			return suit.compareTo(card.getSuit());
		
		
	}
	
	public String toString() {
		return rank.toString() + " of " + suit.toString(); 
	}
}
