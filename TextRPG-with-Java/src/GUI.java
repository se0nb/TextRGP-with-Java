import java.awt.*;

import javax.swing.*;

public class GUI extends JFrame {
	
	public GUI() {
		
		setTitle("TextRPG-with-Java");
		setSize(1600,900);
		Container container = getContentPane();
		container.setLayout(null);
	
		
		JPanel gamingPanel = new JPanel();
		gamingPanel.setBounds(500,0,600,900);
		gamingPanel.setBackground(Color.BLACK);
		gamingPanel.setLayout(null);
		container.add(gamingPanel);
		
		JLabel gamingLabel = new JLabel();
		gamingPanel.add(gamingLabel);
		
		JButton invenButton = new JButton("inven");
		invenButton.setBounds(40,760,60,60);
		gamingPanel.add(invenButton);
		
		JButton equipButton = new JButton("euip");
		equipButton.setBounds(140,760,60,60);
		gamingPanel.add(equipButton);
		
		JButton skillButton = new JButton("skill");
		skillButton.setBounds(240,760,60,60);
		gamingPanel.add(skillButton);
		
		JButton keywordButton = new JButton("keyword");
		keywordButton.setBounds(340,760,60,60);
		gamingPanel.add(keywordButton);
		
		JButton optionButton = new JButton("option");
		optionButton.setBounds(520,20,60,60);
		gamingPanel.add(optionButton);	
		
		JButton playerButton = new JButton("player");
		playerButton.setBounds(20,20,80,80);
		gamingPanel.add(playerButton);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
}
