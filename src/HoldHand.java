// Worked on this class with Guillermo, Keeton, and John

public class HoldHand extends Hand {

	private final int FLUSH_NUM = 5;
	
	public HoldHand(Card c1, Card c2) {
		super(new Card[] {c1,c2});
	}
	
	public void addCard(Card card) {
		
	}
	
	public Card playCard(int index) {
		return null;
	}
	
	public boolean hasFlush(Card[] community) {
		int cCounter = 0;
		int dCounter = 0;
		int hCounter = 0;
		int sCounter = 0;
		
		
		
		for(int i = 0; i < community.length; ++i) {
			
			if(community[i].getSuit().toString() == "C"){
				++cCounter;
			}
			else if(community[i].getSuit().toString() == "D") {
				++dCounter;
			}
			else if(community[i].getSuit().toString() == "H" ) {
				++hCounter;
			}
			else if(community[i].getSuit().toString() == "S"){
				++sCounter;
			}
			
		}
		
		for(int i = 0; i < super.size(); ++i) {
			if(super.getCard(i).getSuit().toString() == "C"){
				++cCounter;
			}
			else if(super.getCard(i).getSuit().toString() == "D") {
				++dCounter;
			}
			else if(super.getCard(i).getSuit().toString() == "H") {
				++hCounter;
			}
			else if(super.getCard(i).getSuit().toString() == "S") {
				++sCounter;
		}
	}
		
		
		
		
		if(cCounter >= FLUSH_NUM||dCounter >= FLUSH_NUM||hCounter >= FLUSH_NUM||sCounter >= FLUSH_NUM) {
			return true;
		}
			
		return false;
	}
	
}
