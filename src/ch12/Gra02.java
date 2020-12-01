package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gra02 extends JFrame{

	private MyPanel panel;
	int x = 10;
	int y = 10;
	
	public Gra02() {
		setTitle("repaint 예제");
		setSize(400, 500);
		
		panel = new MyPanel();
		setContentPane(panel); //
		
		
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					x = e.getX(); // 클릭했을 때의 x 좌표
					y = e.getY(); // 클릭했을 때의 y 좌표
					System.out.println("x : "+x);
					System.out.println("y : "+y);
					repaint();
				}
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g); // 이전 그림을 다 지워준다.
			
			
			g.setColor(Color.BLUE);
			g.drawRect(x, y, 50, 50); // x, y 변수 취급
		}
	}
	
	public static void main(String[] args) {
		new Gra02();

	}

}
