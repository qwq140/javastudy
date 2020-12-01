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

import ch12.Chart3.ChartThread;

public class Chart2 extends JFrame {

	private MyPanel panel;
	private ArrayList<Integer> list = new ArrayList<>();
	private JButton btn = new JButton("Å¬¸¯");
	private int x = 0;
	private int y = 210;
	private int ylength = 0;
	private int xlength = 50;

	public Chart2() {
		list.add(30);
		list.add(80);
		list.add(65);
		list.add(90);
		list.add(100);

		setTitle("draw Chart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		panel = new MyPanel();

		c.add(panel, BorderLayout.CENTER);
		c.add(btn, BorderLayout.SOUTH);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Thread th = new Thread(new ChartThread());
				th.start();

//				for (int i = 0; i < list.size(); i++) {
//					x=x+xlength;
//					ylength=list.get(i);
//					panel.paintComponent(getGraphics());
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e1) {
//						e1.printStackTrace();
//					}
//				}
			}
		});
		setSize(300, 300);
		setVisible(true);

	}

	class ChartThread implements Runnable {

		public void run() {
			for (int i = 0; i < list.size(); i++) {
				x = x + xlength;
				ylength = list.get(i);
				panel.repaint();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
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
		new Chart2();
	}

}
