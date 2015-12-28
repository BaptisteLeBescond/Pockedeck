
public class Pokemon extends Card{
	private int LifePoints;
	private String firstElement;
	private String secondElement;
	private int Stage;
	private Pokemon EvolveFrom;
	
	public static String Elements[] = {"grass", "fire", "water", "lighting", "psychic", "fighting", "darkness", "metal", "fairy", "dragon", "colorless", "null" };
	
	/**
	 * 
	 * @param name
	 * @param type
	 * @param lifepoints
	 * @param firstelement
	 * @param secondelement
	 * @param stage
	 */
	public Pokemon(String name, String type, int lifepoints, String firstelement, String secondelement, int stage){
		super(name, type);
		LifePoints = lifepoints;
		firstElement = firstelement;
		secondElement = secondelement;
		Stage = stage;
		EvolveFrom = null;
	}
	
	/**
	 * 
	 * @param name
	 * @param type
	 * @param lifepoints
	 * @param firstelement
	 * @param secondelement
	 * @param stage
	 * @param evolvefrom
	 */
	public Pokemon(String name, String type, int lifepoints, String firstelement, String secondelement, int stage, Pokemon evolvefrom){
		super(name, type);
		LifePoints = lifepoints;
		firstElement = firstelement;
		secondElement = secondelement;
		Stage = stage;
		EvolveFrom = evolvefrom;
	}
	
	public int getLifePoints() {
		return LifePoints;
	}
	
	public int getStage() {
		return Stage;
	}
	
	public Pokemon getEvolveFrom() {
		return EvolveFrom;
	}

	public String getFirstElement() {
		return firstElement;
	}

	public String getSecondElement() {
		return secondElement;
	}
	
	public String toString(){
		if(this.getSecondElement() != "None"){
			return "Name : " + this.getName() + "\nType : " + this.getType() + "\nLife Points : " + this.getLifePoints() + "\nElements : " + this.getFirstElement() + " / " + this.getSecondElement() + "\nStage : " + this.getStage();
		}
		else{
			return "Name : " + this.getName() + "\nType : " + this.getType() + "\nLife Points : " + this.getLifePoints() + "\nElement : " + this.getFirstElement() + "\nStage : " + this.getStage();
		}
	}

}
