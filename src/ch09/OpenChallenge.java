package ch09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class OpenChallenge extends JFrame{

	public OpenChallenge() {
		setTitle("Open Challenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		JButton btn1 = new JButton("Open");
		JButton btn2 = new JButton("Read");
		JButton btn3 = new JButton("Close");
		
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.LIGHT_GRAY);
		jp1.add(btn1);
		jp1.add(btn2);
		jp1.add(btn3);
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(null);
		
		JLabel hello = new JLabel("Hello");
		hello.setLocation(100, 50);
		hello.setSize(200, 20);
		
		JLabel java = new JLabel("Java");
		java.setLocation(50, 300);
		java.setSize(200, 20);
		
		JLabel love = new JLabel("Love");
		love.setLocation(400,300);
		love.setSize(200, 20);
		
		jp2.add(hello);
		jp2.add(java);
		jp2.add(love);
		
		
		c.add(jp1,BorderLayout.NORTH);
		c.add(jp2,BorderLayout.CENTER);
		
		setSize(500,500);
		setVisible(true);
				
	}
	
	public static void main(String[] args) {
		new OpenChallenge();

	}

}
