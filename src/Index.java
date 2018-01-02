import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Index extends JFrame {
	
	GridLayout mainLayout = new GridLayout(4, 1);
	
	public void closeFrame() {
		this.dispose();
	}
	
	UserName userName;
	
	public Index(String userName) {
		this.userName = new UserName(userName); 
	}
	
	public void addComponentsToPane(final Container pane) {
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		
		JPanel titlePanel = new JPanel();
		JLabel titleLabel = new JLabel("Welcome " + this.userName.name + "!");
		JLabel instruction = new JLabel("To begin, select the topic you would like to learn below.");
		titlePanel.add(titleLabel);
		titlePanel.add(instruction);
		
		JPanel topicSelection = new JPanel();
		topicSelection.setLayout(mainLayout);
		JButton intro = new JButton("Introduction");
		JButton solve = new JButton("How to solve");
		JButton conversion = new JButton("Conversions");
		JButton tips = new JButton("Tips");
		topicSelection.add(intro);
		topicSelection.add(solve);
		topicSelection.add(conversion);
		topicSelection.add(tips);
		
		pane.add(titlePanel);
		pane.add(topicSelection);
		
		intro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Introduction frame = new Introduction(userName.name);
				frame.addComponentsToPane(frame.getContentPane());
				frame.setSize(1400,750);
				frame.setVisible(true);
				closeFrame();
			}
		});
		
		solve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Factoring frame = new Factoring(userName.name);
				frame.addComponentsToPane(frame.getContentPane());
				frame.setSize(850, 450);
				frame.setVisible(true);
				closeFrame();
			}
		});
		
		conversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conversion frame = new Conversion();
				frame.addComponentsToPane(frame.getContentPane());
				frame.setSize(600, 400);
				frame.setVisible(true);
				closeFrame();
			}
		});
		
		/*
		tips.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Index index = new Index();
				index.addComponentsToPane(index.getContentPane());
				index.setSize(400, 300);
				index.setVisible(true);
			}
		}); */
	}
}