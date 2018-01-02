import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Introduction extends JFrame {
	
	public void closeFrame() {
		this.dispose();
	}
	
	UserName userName;
	
	public Introduction(String userName) {
		this.userName = new UserName(userName); 
	}
	
	public void addComponentsToPane(final Container pane) {
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		
		JPanel introPanel = new JPanel();
		introPanel.setLayout(new BoxLayout(introPanel, BoxLayout.Y_AXIS));
		JLabel introHeader = new JLabel("Introduction to Quadratics", SwingConstants.CENTER);
		JLabel labelSummary = new JLabel("<html><br><br>A QUADRATIC FUNCTION is one of the form (f(x) or y) = ax\u00B2 + bx + c, where a, b, and c are integer parameters where 'a' does not equal zero.</html>");
		JLabel labelSummary2 = new JLabel("The graph of a QUADRATIC FUNCTION is a curve called a PARABOLA. Parabola may open upward and vary in 'width' or 'steepness', but they all have the same basic 'U' shape. The follow picture will show different types of parabolas.", SwingConstants.LEFT);
		JLabel parabolaImage = new JLabel(new ImageIcon("parabola.png"), SwingConstants.CENTER);
		JLabel keyPointsLabel = new JLabel("Every Parabola is symmertic with respect to the AXIS OF SYMMETRY. It is important to note that a parabola intersects the axis of symmetry at one point called the VERTEX.");
		JLabel keyPointsLabel2 = new JLabel("It is equally important to note that parabola's either contain one,"
				+ "two, or no solution. Solutions are also referred as X-intercepts.");
		JLabel keyPointsLabel3 = new JLabel("My program will teach you to factor the quadratic function in order"
				+ " to understand and draw a qudratic function."); 
		JLabel key1 = new JLabel("<html><br>Important terms - X and Y intercepts");
		JLabel key2 = new JLabel("                            - Vertex");
		JLabel key3 = new JLabel("                            - Axis of Symmetry");
		JLabel key4 = new JLabel("                            - Parameters</html>");
		
		introPanel.add(introHeader);
		introPanel.add(labelSummary);
		introPanel.add(labelSummary2);
		introPanel.add(parabolaImage);
		introPanel.add(keyPointsLabel);
		introPanel.add(keyPointsLabel2);
		introPanel.add(keyPointsLabel3);
		introPanel.add(key1);
		introPanel.add(key2);
		introPanel.add(key3);
		introPanel.add(key4); 
		
		JPanel backNextButton = new JPanel();
		backNextButton.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;

		JButton backButton = new JButton(" Back ");
		JButton nextButton = new JButton(" Next ");
		
		backNextButton.add(backButton, c);
		backNextButton.add(nextButton, c);
		
		pane.add(introPanel);
		pane.add(backNextButton, c);
		
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeFrame();
				Index index = new Index(userName.name);
				index.addComponentsToPane(index.getContentPane());
				index.setSize(400, 300);
				index.setVisible(true);
			}
		});
		
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Factoring frame = new Factoring(userName.name);
				frame.addComponentsToPane(frame.getContentPane());
				frame.setSize(850, 450);
				frame.setVisible(true);
				closeFrame();
			}
		}); 
		
	}
}
