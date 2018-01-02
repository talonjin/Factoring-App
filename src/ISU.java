import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ISU extends JFrame {
	public static String a1;
	
	GridLayout mainLayout = new GridLayout(3, 1);
	GridLayout nameLayout = new GridLayout(1, 2);
	
	public void closeFrame() {
		this.dispose();
	}
	
	public void addComponentsToPane(final Container pane) {
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		
		JPanel namePanel = new JPanel();
		namePanel.setLayout(mainLayout);
		JLabel nameLabel = new JLabel("Factoring trinomials with Java!", SwingConstants.CENTER);
		namePanel.add(nameLabel);
		
		JPanel descriptionPanel = new JPanel();
		descriptionPanel.setLayout(mainLayout);
		JLabel descriptionLabel = new JLabel("This Java tutorial will teach you how factor trinomials.", SwingConstants.CENTER);
		descriptionPanel.add(descriptionLabel);
		
		JPanel instructionPanel = new JPanel();
		instructionPanel.setLayout(mainLayout);
		JLabel instructionLabel = new JLabel("Instructions: Enter name to being. Type 'help' for help.", SwingConstants.CENTER);
		instructionPanel.add(instructionLabel);
		
		JPanel userNamePanel = new JPanel();
		userNamePanel.setLayout(nameLayout);
		JLabel userNameLabel = new JLabel("Please enter your name:    ", SwingConstants.RIGHT);
		final JTextField userNameEnter = new JTextField();
		userNamePanel.add(userNameLabel);
		userNamePanel.add(userNameEnter);
		
		JPanel submitNamePanel = new JPanel();
		JButton submitNameButton = new JButton("Submit");
		submitNamePanel.add(submitNameButton);
		
		pane.add(namePanel);
		pane.add(descriptionPanel);
		pane.add(instructionPanel);
		pane.add(userNamePanel);
		pane.add(submitNamePanel);
		
		submitNameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeFrame();
				String userName = userNameEnter.getText();
				System.out.print(userName);
				Index index = new Index(userName);
				index.addComponentsToPane(index.getContentPane());
				index.setSize(400, 300);
				index.setVisible(true);
			}
		});
		
	}
	
	private static void createAndShowGUI() {
		ISU frame = new ISU();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addComponentsToPane(frame.getContentPane());
		frame.setSize(600, 300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

}