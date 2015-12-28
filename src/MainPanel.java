import java.awt.*;
import javax.swing.*;

public class MainPanel extends JFrame{
	
	JTextField nameText;
	JTextField lifepointsText;
	JTextField energyText;
	JComboBox<String> typeSelect;
	JComboBox<String> firstElementSelect;
	JComboBox<String> secondElementSelect;
	JTextArea descriptionText;
	
	public MainPanel(){
		JPanel panel = new JPanel(new GridBagLayout());
		panel.setBorder(BorderFactory.createLineBorder(Color.black));
		JLabel title = new JLabel("Add Card !");
		JLabel name = new JLabel("Nom :");
		JLabel type = new JLabel("Type :");
		JLabel lifepoints = new JLabel("PV :");
		JLabel energy = new JLabel("Energy :");
		JLabel description = new JLabel("Description :");
		JLabel firstElement = new JLabel("First element (mandatory) :");
		JLabel secondElement = new JLabel("Second element (optionnal) :");
		
		nameText = new JTextField();
		lifepointsText = new JTextField();
		energyText = new JTextField();
		descriptionText = new JTextArea();
		typeSelect = new JComboBox<String>();
		typeSelect.addItem("Pokémon");
		firstElementSelect = new JComboBox<String>();
		firstElementSelect.addItem("Fire");
		firstElementSelect.addItem("Water");
		firstElementSelect.addItem("Grass");
		secondElementSelect = new JComboBox<String>();
		secondElementSelect.addItem("None");
		secondElementSelect.addItem("Fire");
		secondElementSelect.addItem("Water");
		secondElementSelect.addItem("Grass");
		JButton poke = new JButton("POKÉ");	
		
		poke.addActionListener(new PokemonAdded(this));
		
		JFrame window = new JFrame("Pockedeck");
		window.setSize(600, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(0,0,10,0);  //top padding
		c.ipady = 50;
		c.ipadx = 50;
		window.add(panel, c);
		
		int y = 0;
		
		c.ipady = 20;
		c.ipadx = 50;
		c.gridx = 0;
	    c.gridy = y;
		panel.add(title, c);
		
		c.gridx = 0;
	    c.gridy = ++y;
		panel.add(type, c);
		c.gridx = 1;
	    c.gridy = y;
	    panel.add(typeSelect, c);
		
		c.gridx = 0;
	    c.gridy = ++y;
		panel.add(name, c);
		c.gridx = 1;
	    c.gridy = y;
	    panel.add(nameText, c);
	    
		c.gridx = 0;
	    c.gridy = ++y;
		panel.add(lifepoints, c);
		c.gridx = 1;
	    c.gridy = y;
	    panel.add(lifepointsText, c);
	    
		c.gridx = 0;
	    c.gridy = ++y;
		panel.add(energy, c);
		c.gridx = 1;
	    c.gridy = y;
	    panel.add(energyText, c);
	    
	    c.gridx = 0;
	    c.gridy = ++y;
		panel.add(firstElement, c);
		c.gridx = 1;
	    c.gridy = y;
	    panel.add(firstElementSelect, c);
	    
	    c.gridx = 0;
	    c.gridy = ++y;
		panel.add(secondElement, c);
		c.gridx = 1;
	    c.gridy = y;
	    panel.add(secondElementSelect, c);
	    
	    c.gridx = 0;
	    c.gridy = ++y;
		panel.add(description, c);
		c.gridx = 1;
	    c.gridy = y;
	    panel.add(descriptionText, c);
	    
	    c.gridx = 1;
	    c.gridy = ++y;
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
	
	public String getName(){
		String pokeName = nameText.getText();
		return pokeName;
	}
	
	public String getLifePoints(){
		String pokeLifepoints = lifepointsText.getText();
		return pokeLifepoints;
	}
	
	public String getEnergy(){
		String pokeEnergy = energyText.getText();
		return pokeEnergy;
	}
	
	public String getFirstElement(){
		String firstElement = (String) firstElementSelect.getSelectedItem(); 
		return firstElement;
	}

	public String getSecondElement(){
		String secondElement = (String) secondElementSelect.getSelectedItem(); 
		return secondElement;
	}
}
