import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> set = new ArrayList<Card>();

	public ArrayList<Card> getSet() {
		return set;
	}

	/**
	 * 
	 * @param card
	 */
	public void addCard(Card card){
		set.add(card);
	}
}
