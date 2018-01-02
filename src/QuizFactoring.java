import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class QuizFactoring extends JFrame {
	
	UserName userName;
	String[][] answer = {{"(2x + 3)", "(x + 1)"}, {"(x - 4)", "(x + 1)"}, {"(3x + 1)", "(x + 1)"}};	
	//make 2d array above
	
	ArrayList<String> userAnswer = new ArrayList<String>();
	
	public void closeFrame() {
		this.dispose();
	}
	
	public QuizFactoring(String userName) {
		this.userName = new UserName(userName); 
	}
	
	public void addComponentsToPane(final Container pane) {
			pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
			
			JPanel titlePanel = new JPanel();
			JLabel titleLabel = new JLabel("Welcome " + userName.name + " . Let's begin with your first quiz.");
			titlePanel.add(titleLabel);
			
			JPanel quizPanel = new JPanel();
			quizPanel.setLayout(new BoxLayout(quizPanel, BoxLayout.Y_AXIS));
			JLabel questionTitle1 = new JLabel("1) Factor the following Quadratic Equations. Type your answer in the console below.");
			JLabel question1 = new JLabel("    a) 2x\u00B2 + 5x + 3");
			final JTextField answer1 = new JTextField("");
			
			JLabel question2 = new JLabel("    b) x\u00B2 - 3x - 4");
			JTextField answer2 = new JTextField("");
			final String a2 = answer2.getText();
			userAnswer.add(a2);
			
			JLabel question3 = new JLabel("    c) 3x\u00B2 + 4x + 1");
			JTextField answer3 = new JTextField("");
			final String a3 = answer3.getText();
			userAnswer.add(a3);
			
			quizPanel.add(questionTitle1);
			quizPanel.add(question1);
			quizPanel.add(answer1);
			quizPanel.add(question2);
			quizPanel.add(answer2);
			quizPanel.add(question3);
			quizPanel.add(answer3);
			
			JPanel backSubmitNextButton = new JPanel();
			backSubmitNextButton.setLayout(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			c.fill = GridBagConstraints.HORIZONTAL;

			JButton backButton = new JButton(" Back ");
			JButton submitButton = new JButton(" Submit ");
			JButton nextButton = new JButton(" Next ");
			
			backSubmitNextButton.add(backButton);
			backSubmitNextButton.add(submitButton);
			backSubmitNextButton.add(nextButton);
			
			pane.add(titlePanel);
			pane.add(quizPanel);
			pane.add(backSubmitNextButton);
			
			submitButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final String a1 = answer1.getText();
					userAnswer.add(a1);
					
					System.out.print(a1);
					
					for (int i = 0; i < answer.length; i++) {
							if(answer[i].equals(userAnswer.get(i))) {
								System.out.println("Correct");
							} else {
								System.out.println("Incorrect");
							}
						}
					}
				
			});		
	}
}