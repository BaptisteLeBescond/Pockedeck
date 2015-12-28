
public class EnergyCard extends Card {
	
	private String element;
	public static String Elements[] = {"grass", "fire", "water", "lighting", "psychic", "fighting", "darkness", "metal", "fairy", "dragon", "colorless" };
	
	
	public EnergyCard(String name, String type, String element) {
		super(name, type);
		this.element = element;
		// TODO Auto-generated constructor stub
	}
	
	public String getElement() {
		return element;
	}
	
}
