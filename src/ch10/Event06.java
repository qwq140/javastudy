package ch10;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event06 extends JFrame {
	
	private JLabel la = new JLabel("Hello"); 
		
	
	
	public Event06() {
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseLitener());
		
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
		
		setSize(250,250);
		setVisible(true);
	}
	
	class MyMouseLitener implements MouseListener{
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		new Event06();

	}

}
