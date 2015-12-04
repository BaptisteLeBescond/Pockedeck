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
		System.out.println(panel.getData());
	}
}
