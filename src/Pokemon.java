
public class Pokemon {
	private String Type;
	private int LifePoints;
	private String Name;
	private int Stage;
	private Pokemon EvolveFrom;
	
	/**
	 * 
	 * @param t
	 * @param lp
	 * @param n
	 * @param s
	 */
	public Pokemon(String t, int lp, String n, int s){
		Type = t;
		LifePoints = lp;
		Name = n;
		Stage = s;
		EvolveFrom = null;
	}
	
	/**
	 * 
	 * @param t
	 * @param lp
	 * @param n
	 * @param s
	 * @param ef
	 */
	public Pokemon(String t, int lp, String n, int s, Pokemon ef){
		Type = t;
		LifePoints = lp;
		Name = n;
		Stage = s;
		EvolveFrom = ef;
	}
	
	public String getType() {
		return Type;
	}
	
	public int getLifePoints() {
		return LifePoints;
	}
	
	public String getName() {
		return Name;
	}
	
	public int getStage() {
		return Stage;
	}
	
	public Pokemon getEvolveFrom() {
		return EvolveFrom;
	}

}
