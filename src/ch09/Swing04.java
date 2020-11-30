package ch09;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;

public class Swing04 extends JFrame {

	private JButton btn1, btn2, btn3;
	private JLabel la1, la2, la3;
	private JPanel pa1, pa2;
	private Container c;
	
	public Swing04() {
		setTitle("Open Challenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		
		initObject();
		
		initSetting();
		
		initBatch();
		
		setVisible(true);
	}
	
	public void initSetting() {
		c = getContentPane();
		pa1.setBackground(Color.LIGHT_GRAY);
		
		pa2.setLayout(null);
		la1.setBounds(134, 23, 57, 15);
		la2.setBounds(45, 161, 57, 15);
		la3.setBounds(327, 106, 57, 15);
	}
	
	public void initObject() {
		pa1 = new JPanel();
		btn1 = new JButton("Open");
		btn2 = new JButton("Read");
		btn3 = new JButton("Close");
		
		pa2 = new JPanel();
		la1 = new JLabel("Hello");
		la2 = new JLabel("Java");
		la3 = new JLabel("Love");
	}
	
	private void initBatch() {
		
		pa1.add(btn1);
		pa1.add(btn2);
		pa1.add(btn3);
		c.add(pa1, BorderLayout.NORTH);
		
		pa2.add(la1);
		pa2.add(la2);
		pa2.add(la3);
		c.add(pa2, BorderLayout.CENTER);
		
	}
	public static void main(String[] args) {
		new Swing04();
	}
}
