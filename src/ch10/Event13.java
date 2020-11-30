package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event13 extends JFrame {

	private JLabel[] la;
	private JLabel la4;
	private Container c;

	public Event13() {
		setTitle("Open Challenge 10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(380, 400);

		la = new JLabel[3];

		la[0] = new JLabel("0");
		la[1] = new JLabel("0");
		la[2] = new JLabel("0");
		la4 = new JLabel("시작합니다.");

		c = getContentPane();
		c.setLayout(null);
		
		c.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				Container contentPan = (Container)e.getSource();
				if(e.getKeyChar()=='\n') {
					for (int i = 0; i < la.length; i++) {
						int x = (int)(Math.random()*5);
						String x1 = Integer.toString(x);
						la[i].setText(x1);
					}
				}
			}
			
		});
		
		for (int i = 0; i < la.length; i++) {
			la[i].setSize(100, 50);
			la[i].setLocation(20*(i+1)+i*100, 50);
			la[i].setOpaque(true);
			la[i].setBackground(Color.PINK);
			la[i].setHorizontalAlignment(la[i].CENTER);
			la[i].setFont(new Font("Serif", Font.BOLD, 50));
			la[i].setForeground(Color.YELLOW);
			c.add(la[i]);
			
		}

		la4.setSize(100, 20);
		la4.setLocation(150, 180);
		c.add(la4);
		
		
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}

	public static void main(String[] args) {
		new Event13();
	}

}
