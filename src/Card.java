
public abstract class Card {
	private String name;
	private String type;
	public static String Types[] = {"pokemon", "energy", "trainer"};

	/**
	 * 
	 * @param name
	 * @param type
	 */
	public Card(String name, String type){
		this.name = name;
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

}
