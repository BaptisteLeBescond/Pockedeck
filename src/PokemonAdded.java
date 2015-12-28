import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PokemonAdded implements ActionListener {

	private MainPanel panel;
	
	public PokemonAdded(MainPanel vue) {
		// TODO Auto-generated constructor stub
		panel = vue;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		// To change, whether pokemon, trainer or energy is selected before
		Card card = new Pokemon(panel.getName(), "pokemon", Integer.parseInt(panel.getLifePoints()), panel.getFirstElement(), panel.getSecondElement(), 0);
		Deck deck = new Deck();
		deck.addCard(card);
		
		System.out.println(card);
	}
}
