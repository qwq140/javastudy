package ch09;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex04 extends JFrame{
	
	public Ex04() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1,10);
		
		Container c = getContentPane();
		
		c.setLayout(grid);
		
		c.add(new JLabel("0"));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
