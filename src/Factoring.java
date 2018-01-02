import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Factoring extends JFrame {
	
	public void closeFrame() {
		this.dispose();
	}
	
	UserName userName;
	
	public Factoring(String userName) {
		this.userName = new UserName(userName); 
	}
	
	public void addComponentsToPane(final Container pane) {
			pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
			
			JPanel introPanel = new JPanel();
			introPanel.setLayout(new BoxLayout(introPanel, BoxLayout.Y_AXIS));
			JLabel titleLabel = new JLabel("Learning how to factor quadratics", SwingConstants.CENTER);
			JLabel space = new JLabel(" ");
			JLabel step1 = new JLabel("STEP #1: Identify a quadratic equation.");
			JLabel text1 = new JLabel("    A quadratic equation is always a TRINOMIAL with form ax^2 + bx + c");
			JLabel example1 = new JLabel("    Example: x\u00B2 - 2x + 1");
			
			JLabel space2 = new JLabel(" ");
			JLabel step2 = new JLabel("STEP #2: Factor out the common multiple of the three terms if possible.");
			JLabel text2 = new JLabel("    Quadratic equations are sometimes not 'clean'. For efficiency, find a common multiple.");
			JLabel example2 = new JLabel("    Example: 2x\u00B2 - 4x + 2 ----> 2(x\u00B2 - 2x + 1");
			
			JLabel space3 = new JLabel(" ");
			JLabel step3 = new JLabel("STEP #3: Decomposition: Multiply the a value and the c value. Find two factors of the product that adds or subtracts to the b value.");
			JLabel text3 = new JLabel("    List the factors of the product, then replace the b value with the two new numbers.");
			JLabel example3 = new JLabel("    3x\u00B2 + x - 2 ----> 3x\u00B2 + 3x - 2x - 2");
			
			JLabel space4 = new JLabel(" ");
			JLabel step4 = new JLabel("STEP #4: Begin to factor out the first two terms and the last two terms.");
			JLabel text4 = new JLabel("    Note that the expression in the bracket's must be corresponding.");
			JLabel example4 = new JLabel("    3x\u00B2 + 3x - 2x - 2 ----> 3x(x + 1) - 2(x + 1)");
			
			JLabel space5 = new JLabel(" ");
			JLabel step5 = new JLabel("STEP #5: Finish by multiplying the remaining expression with the corresponding expression.");
			JLabel text5 = new JLabel("    The remaining values outside the brackets become its own expression.");
			JLabel example5 = new JLabel("    3x(x + 1) - 2(x + 1) ----> (x + 1)(3x - 2)");
			
			JPanel backQuizNextButton = new JPanel();
			backQuizNextButton.setLayout(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			c.fill = GridBagConstraints.HORIZONTAL;

			JButton backButton = new JButton(" Back ");
			JLabel space6 = new JLabel(" ");
			JButton quizButton = new JButton(" Quiz ");
			JLabel space7 = new JLabel(" ");
			JButton nextButton = new JButton(" Next ");
			
			backQuizNextButton.add(backButton);
			backQuizNextButton.add(space6);
			backQuizNextButton.add(quizButton);
			backQuizNextButton.add(space7);
			backQuizNextButton.add(nextButton);
			
			introPanel.add(titleLabel);
			
			introPanel.add(space);
			introPanel.add(step1);
			introPanel.add(text1);
			introPanel.add(example1);
			
			introPanel.add(space2);
			introPanel.add(step2);
			introPanel.add(text2);
			introPanel.add(example2);
			
			introPanel.add(space3);
			introPanel.add(step3);
			introPanel.add(text3);
			introPanel.add(example3);
			
			introPanel.add(space4);
			introPanel.add(step4);
			introPanel.add(text4);
			introPanel.add(example4);
			
			introPanel.add(space5);
			introPanel.add(step5);
			introPanel.add(text5);
			introPanel.add(example5);
			
			pane.add(introPanel);
			pane.add(backQuizNextButton);
			
			backButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					closeFrame();
					Index index = new Index(userName.name);
					index.addComponentsToPane(index.getContentPane());
					index.setSize(400, 300);
					index.setVisible(true);
				}
			});
			
			quizButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					closeFrame();
					QuizFactoring frame = new QuizFactoring(userName.name);
					frame.addComponentsToPane(frame.getContentPane());
					frame.setSize(850,500);
					frame.setVisible(true);
				}
			});
			
			nextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					closeFrame();
					Conversion frame = new Conversion();
					frame.addComponentsToPane(frame.getContentPane());
					frame.setSize(850,500);
					frame.setVisible(true);
				}
			});		
	}
}