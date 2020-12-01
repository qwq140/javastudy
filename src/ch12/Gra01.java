package ch12;

import java.awt.*;
import javax.swing.*;


public class Gra01 extends JFrame {
	
	private MyPanel panel = new MyPanel();
	
	public Gra01() {
		setTitle("JPanel�� paintComponent() ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(250, 220);
		setVisible(true);
	}
	
	//Jpanel�� ��ӹ޴�  �� �г� ����
	class MyPanel extends JPanel{
		public MyPanel() {
			
		}
		
		@Override
		public void paintComponent(Graphics g) { // ��
			super.paintComponent(g); // �г� ���� ������ �׷��� �ܻ��� ����� ���� ȣ��
			g.setColor(Color.BLUE);
			g.drawRect(10, 10, 50, 50);
			g.setColor(Color.MAGENTA);
			g.drawRect(90, 90, 50, 50);
			
		}
	}
	
	
	public static void main(String[] args){
		new Gra01();

	}

}
