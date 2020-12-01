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

	Street2 street = this; // �ڱ� ���ؽ�Ʈ�� MyThread Ŭ������ �ѱ� (�ܺ�Ŭ������ �ѱ涧) ������Ʈ���� ����
	// ��ǳ�� ���� ��ġ
	private int x = 340;
	private int y = 20;
	boolean isRunning = true;

	Container c;

	public Street2() {
		setTitle("��ǳ");
		setSize(900, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // ����� ���߾ӿ� JFrame ��ġ
		c = getContentPane();

		c.add(new GamePanel());
		setVisible(true);
	}

	// JPanel�� �⺻ ���̾ƿ� : �÷ο췹�̾ƿ�
	class GamePanel extends JPanel {

		ImageIcon imgIconPlayer, imgIconJang;
		Image imgPlayer, imgJang;
		JButton btn;

		public GamePanel() {
			imgIconPlayer = new ImageIcon("images/player.png");
			imgIconJang = new ImageIcon("images/jang.png");
			imgPlayer = imgIconPlayer.getImage();
			imgJang = imgIconJang.getImage();
			btn = new JButton("����");
			add(btn);
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					isRunning = !isRunning; // ��۹�ư
					
				}
			});
			// focus�� �⺻������ JFrame�� �־����ִ�.
			setFocusable(true);

			// �ѹ����̸� �͸�, ��Ȱ���ϸ� ���� ����
			addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_SPACE) {
						new Thread(new Runnable() {
							@Override
							public void run() { // run �޼��� ����
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
