import java.awt.*;

import javax.swing.*;

public class GUI extends JFrame {
	public GUI() {
		ImageIcon optionImg = new ImageIcon(GUI.class.getResource("image/optionButton.png"));
		ImageIcon invenImg = new ImageIcon("image/image_exitButton.jpg");
		ImageIcon equipImg = new ImageIcon("image/image_exitButton.jpg");
		ImageIcon skillImg = new ImageIcon("image/image_exitButton.jpg");
		ImageIcon keywordImg = new ImageIcon("image/image_exitButton.jpg");
		ImageIcon playerImg = new ImageIcon("image/image_exitButton.jpg");
		JPanel backgroundPanel = new JPanel() {
			Image background=new ImageIcon(GUI.class.getResource("image/background.jpg")).getImage();
			public void paint(Graphics g) {
					g.drawImage(background, 0, 0, null);	
			}
		};
		setTitle("TextRPG-with-Java");
		setSize(1600,900);
		Container container = getContentPane();
		container.setLayout(null);
		
		JPanel gamingPanel = new JPanel();
		gamingPanel.setBounds(500,0,600,900);
		gamingPanel.setBackground(Color.BLACK);
		gamingPanel.setLayout(null);
		container.add(gamingPanel);
		
		backgroundPanel.setLayout(null);
		backgroundPanel.setBounds(0, 0, 1600, 900);
		container.add(backgroundPanel);
		
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
		
		JButton optionButton = new JButton(optionImg);
		optionButton.setBounds(520,20,60,60);
		optionButton.setFocusPainted(false);
		optionButton.setContentAreaFilled(false);
		optionButton.setBorderPainted(false);
		gamingPanel.add(optionButton);	
		
		JButton playerButton = new JButton("player");
		playerButton.setBounds(20,20,80,80);
		gamingPanel.add(playerButton);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
}
