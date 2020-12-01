package ch12;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Street2 extends JFrame {

	Street2 street = this; // 자기 컨텍스트를 MyThread 클래스에 넘김 (외부클래스에 넘길때) 오브젝트끼리 협력
	// 장풍에 대한 위치
	private int x = 340;
	private int y = 20;
	boolean isRunning = true;

	Container c;

	public Street2() {
		setTitle("장풍");
		setSize(900, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // 모니터 정중앙에 JFrame 배치
		c = getContentPane();

		c.add(new GamePanel());
		setVisible(true);
	}

	// JPanel의 기본 레이아웃 : 플로우레이아웃
	class GamePanel extends JPanel {

		ImageIcon imgIconPlayer, imgIconJang;
		Image imgPlayer, imgJang;
		JButton btn;

		public GamePanel() {
			imgIconPlayer = new ImageIcon("images/player.png");
			imgIconJang = new ImageIcon("images/jang.png");
			imgPlayer = imgIconPlayer.getImage();
			imgJang = imgIconJang.getImage();
			btn = new JButton("멈춤");
			add(btn);
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					isRunning = !isRunning; // 토글버튼
					
				}
			});
			// focus는 기본적으로 JFrame에 주어져있다.
			setFocusable(true);

			// 한번만이면 익명, 재활용하면 따로 빼서
			addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_SPACE) {
						new Thread(new Runnable() {
							@Override
							public void run() { // run 메서드 종료
								while (true) {
									while (isRunning) {
										x = x + 10;
										repaint();
										try {
											Thread.sleep(50);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
									}
								}
							}
						}).start();
					}
				}
			});
		}

		class ThreadStreet extends Thread {
			@Override
			public void run() {
				while (x != 640) {
					x = x + 10;
					repaint();
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}

		@Override
		protected void paintComponent(Graphics g) {

			super.paintComponent(g);
			g.drawImage(imgPlayer, 0, 0, null);
			g.drawImage(imgJang, x, y, null);
		}
	}

	public static void main(String[] args) {
		new Street2();

	}

}
