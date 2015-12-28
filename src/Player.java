
public class Player {
	private String name;
	private Deck deck;
	private int prizeCards;
	
	/**
	 * 
	 * @param name
	 */
	public Player(String name){
		this.name = name;
		this.deck = new Deck();
		this.prizeCards = 0;
	}
	
	public String getName(){
		return name;
	}
	
	public Deck getDeck(){
		return deck;
	}
	
	public int getPrizeCards(){
		return prizeCards;
	}
	
	public String toString(){
		return name;
	}
}

