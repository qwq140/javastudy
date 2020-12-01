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


public class Chart3 extends JFrame{

	private MyPanel panel;
	private ArrayList<Integer> list = new ArrayList<>();
	private JButton btn;
	private int x=0;
	private int y=210;
	private int ylength=0;
	private int xlength=50;
	
	
	public Chart3() {
		list.add(30);
		list.add(80);
		list.add(65);
		list.add(90);
		list.add(100);
		
		setTitle("draw Chart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		
		Container c = getContentPane();
		panel = new MyPanel();
		btn = new JButton("Å¬¸¯");
		
		c.add(panel,BorderLayout.CENTER);
		c.add(btn, BorderLayout.SOUTH);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread th = new Thread(new ChartThread());
				th.start();
			}
		});
		
		setVisible(true);
	}
	

	class ChartThread implements Runnable{
		
		public void run() {
			x=x+xlength;
			for (int i = 0; i < list.get(0); i++) {
				ylength=i;
				panel.repaint();
				try {
					Thread.sleep(50);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	
	class MyPanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			g.setColor(Color.GRAY);
			g.drawLine(x,y,x,y-ylength);
		}
	}
	
	public static void main(String[] args) {
		new Chart3();
	}

}
