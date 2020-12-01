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

import lombok.Data;

public class Chart4 extends JFrame {

	private MyPanel panel;
	private ArrayList<Integer> list = new ArrayList<>();
	private JButton btn;
	private int x = 0;
	private int y = 210;
	private int xlength = 50;
	private int ylength = 0;
	private ArrayList<Integer> xLocation= new ArrayList<>();
	
	public Chart4() {
		list.add(30);
		list.add(80);
		list.add(65);
		list.add(90);
		list.add(100);
		
		xLocation.add(50);
		xLocation.add(100);
		xLocation.add(150);
		xLocation.add(200);
		xLocation.add(250);
		
		setTitle("draw Chart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);

		Container c = getContentPane();
		panel = new MyPanel();
		btn = new JButton("Å¬¸¯");

		c.add(panel, BorderLayout.CENTER);
		c.add(btn, BorderLayout.SOUTH);

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Thread th = new Thread(new ChartThread());
				th.start();
				

			}
		});

		setVisible(true);
	}

	
	class ChartThread implements Runnable {

		public void run() {
			int m=0;
			for(int j = 0 ; j<list.get(m);j++) {
				ylength = j;
				for (int i = 0; i < list.size(); i++) {
					x=xLocation.get(i);
					panel.repaint();
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
	}

	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			g.setColor(Color.GRAY);
			g.drawLine(x, y, x, y - ylength);
		}
	}

	public static void main(String[] args) {
		new Chart4();
	}

}
