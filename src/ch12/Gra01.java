package ch12;

import java.awt.*;
import javax.swing.*;


public class Gra01 extends JFrame {
	
	private MyPanel panel = new MyPanel();
	
	public Gra01() {
		setTitle("JPanel의 paintComponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(250, 220);
		setVisible(true);
	}
	
	//Jpanel을 상속받는  새 패널 구현
	class MyPanel extends JPanel{
		public MyPanel() {
			
		}
		
		@Override
		public void paintComponent(Graphics g) { // 붓
			super.paintComponent(g); // 패널 내의 이전의 그려진 잔상을 지우기 위해 호출
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
