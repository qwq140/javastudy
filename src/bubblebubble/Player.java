package bubblebubble;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {

	private Player player = this;
	private final static String TAG = "Player : ";
	private ImageIcon icPlayerR, icPlayerL;
	// �÷��̾��� ��ǥ
	private int x = 55; // �ʱ� 55 
	private int y = 535;  // �ʱ� 535

	public boolean isRight = false; // ���¸� ����� ����?
	public boolean isLeft = false;
	public boolean isUp = false;
	public boolean isDown = false;
	
	public int floor = 1; //535, 415, 295, 177 (enum���� �ϸ� ����)
	

	public Player() {
		icPlayerR = new ImageIcon("image/playerR.png");
		icPlayerL = new ImageIcon("image/playerL.png");

		setIcon(icPlayerR);
		setSize(50, 50); // ������ �ʴ� ���� ���°� �ƴϴ�.
		setLocation(x, y);
	}

	public void moveRight() { // �޼����� �̸��� ���Ҷ� ������ ����
		System.out.println(TAG + "moveRight");

		new Thread(new Runnable() {
			@Override
			public void run() {
				setIcon(icPlayerR);
				isRight = true;
				while (isRight) {
					x++;
					setLocation(x, y); // ���ο� repaint() ����
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

	public void moveLeft() {
		System.out.println(TAG + "moveLeft");
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				setIcon(icPlayerL);
				isLeft = true;
				while (isLeft) {
					x--;
					setLocation(x, y); // ���ο� repaint() ����
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

	public void moveUp() {
		System.out.println(TAG + "moveUp");

		new Thread(new Runnable() {

			@Override
			public void run() {
				isUp = true;
				for (int i = 0 ; i < 130 ; i++) {
					y--;
					setLocation(x, y);
					if(y<=535 && y>415) {
						floor = 1;
					}
					if(y<=415 && y>295) {
						floor = 2;
					}
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				moveDown();
			}
		}).start();
	}

	public void moveDown() {
		System.out.println(TAG + "moveDown");
		new Thread(new Runnable() {
			@Override
			public void run() {
				isDown = true;
				while (isDown) {
					y++;
					setLocation(x, y);
					if(floor == 1 &&/*x��ǥ*/ y >=535 ) {
						break;
					}
					if (floor == 2  &&y >= 415) {
						break;
					}
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}


	// ��������
	public void attack() {
		
	}
}
