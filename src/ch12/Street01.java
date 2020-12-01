package ch12;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Street01 extends JFrame{

	// 장풍에 대한 위치
	private int x = 340;
	private int y = 20;
	
	Container c;
	
	public Street01() {
		setTitle("장풍");
		setSize(900, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // 모니터 정중앙에 JFrame 배치
		c=getContentPane();
		c.add(new GamePanel());
		setVisible(true);
	}
	
	class GamePanel extends JPanel{
		
		ImageIcon imgIconPlayer, imgIconJang;
		Image imgPlayer, imgJang; 
		
		public GamePanel() {
			imgIconPlayer = new ImageIcon("images/player.png");
			imgIconJang = new ImageIcon("images/jang.png");
			imgPlayer = imgIconPlayer.getImage();
			imgJang = imgIconJang.getImage();
			// focus는 기본적으로 JFrame에 주어져있다.
			setFocusable(true);
			
			addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					System.out.println("x좌표 : " + x);
					if (x>=340&&x<=650) {
						if(e.getKeyCode() == KeyEvent.VK_RIGHT && x!=650) {
							x= x +10;
						} else if (e.getKeyCode() == KeyEvent.VK_LEFT && x!=340) {
							x= x -10;
						}
					}
					repaint();
				}
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {

			super.paintComponent(g);
			g.drawImage(imgPlayer,0,0,null);
			g.drawImage(imgJang,x,y,null);
		}
	}
	
	public static void main(String[] args) {
		new Street01();

	}

}
