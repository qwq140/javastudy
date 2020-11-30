package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event09 extends JFrame{

	private JLabel la = new JLabel();
	
	public Event09() {
		setTitle("Key Code ���� : F1Ű:�ʷϻ�, % Ű �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			
			la.setText(KeyEvent.getKeyText(e.getKeyCode())+"Ű�� �ԷµǾ���");
			
			if (e.getKeyChar()=='%') {
				contentPane.setBackground(Color.YELLOW);
			} else if(e.getKeyCode()==KeyEvent.VK_F1) {
				contentPane.setBackground(Color.GREEN);
			}
		}
	}
	
	public static void main(String[] args) {
		new Event09();

	}

}
