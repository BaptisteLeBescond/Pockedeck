
public class TrainerCard extends Card {

	private String TrainerType;
	private String TextBox;
	private String Rule;
	
	public TrainerCard(String name, String type, String trainertype, String textbox, String rule) {
		super(name, type);
		this.TrainerType = trainertype;
		this.TextBox = textbox;
		this.Rule = rule;
		// TODO Auto-generated constructor stub
	}

	public String getTrainerType() {
		return TrainerType;
	}

	public String getTextBox() {
		return TextBox;
	}


	public String getRule() {
		return Rule;
	}

	public String toString(){
		return "Name : " + this.getName() + "\nType : " + this.getType() + "\nTrainer Type : " + this.getTrainerType() + "\nText Box : " + this.getTextBox() + "\nRule : " + this.getRule();
	}
}
