import java.awt.*;
import javax.swing.*;

public class MainPanel extends JFrame{
	
	JTextField nameText;
	JTextField lifepointsText;
	JTextField energyText;
	
	public MainPanel(){
		JPanel panel = new JPanel(new GridBagLayout());
		panel.setBorder(BorderFactory.createLineBorder(Color.black));
		JLabel title = new JLabel("Ajouter Pokémon !");
		JLabel name = new JLabel("Nom :");
		JLabel lifepoints = new JLabel("PV :");
		JLabel energy = new JLabel("Energy :");
		JLabel description = new JLabel("Description :");
		nameText = new JTextField();
		lifepointsText = new JTextField();
		energyText = new JTextField();
		JTextArea descriptionText = new JTextArea();
		JButton poke = new JButton("POKÉ");
	
		
		poke.addActionListener(new PokemonAdded(this));
		
		JFrame window = new JFrame("Mon petit pancake au fromage");
		window.setSize(600, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(0,0,10,0);  //top padding
		c.ipady = 50;
		c.ipadx = 50;
		window.add(panel, c);
		
		c.ipady = 20;
		c.ipadx = 50;
		c.gridx = 0;
	    c.gridy = 0;
		panel.add(title, c);
		
		c.gridx = 0;
	    c.gridy = 1;
		panel.add(name, c);
		c.gridx = 1;
	    c.gridy = 1;
	    panel.add(nameText, c);
	    
		c.gridx = 0;
	    c.gridy = 2;
		panel.add(lifepoints, c);
		c.gridx = 1;
	    c.gridy = 2;
	    panel.add(lifepointsText, c);
	    
		c.gridx = 0;
	    c.gridy = 3;
		panel.add(energy, c);
		c.gridx = 1;
	    c.gridy = 3;
	    panel.add(energyText, c);
	    
	    c.gridx = 0;
	    c.gridy = 4;
		panel.add(description, c);
		c.gridx = 1;
	    c.gridy = 4;
	    panel.add(descriptionText, c);
	    
	    c.gridx = 1;
	    c.gridy = 5;
	    c.ipady = 20;
		c.ipadx = 100;
		panel.add(poke, c);
		
		window.setVisible(true);
	}
	
	public String getData(){
		String pokeName = nameText.getText();
		String pokeLifepoints = lifepointsText.getText();
		String pokeEnergy = energyText.getText();
		return ("Nouveau pokémon : ").concat(pokeName).concat(" ").concat(pokeLifepoints).concat(" ").concat(pokeEnergy);
	}
}
