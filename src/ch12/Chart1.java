package ch12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Chart1 extends JFrame{

	private MyPanel panel;
	private ArrayList<Integer> list = new ArrayList<>();
	private JButton btn = new JButton("Å¬¸¯");
	private int x=0;
	private int y=0;
	private int ylength=0;
	private int xlength=0;
	
	
	public Chart1() {
		list.add(30);
		list.add(80);
		list.add(65);
		list.add(90);
		list.add(100);
		
		setTitle("draw Chart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		panel = new MyPanel();
		
		
		
		c.add(panel,BorderLayout.CENTER);
		c.add(btn, BorderLayout.SOUTH);
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	class MyPanel extends JPanel{
		public MyPanel() {
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					x=50;
					xlength=50;
					y=210;
					repaint();
				}
			});
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.GRAY);
			for (int i = 0; i < list.size(); i++) {
				g.drawLine(x,y,x,y-list.get(i));
				x=x+xlength;
			}
			
		}
	}
	
	public static void main(String[] args) {
		new Chart1();
	}

}
