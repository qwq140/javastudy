package bubblebubble;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {

	private Player player = this;
	private final static String TAG = "Player : ";
	private ImageIcon icPlayerR, icPlayerL;
	// 플레이어의 좌표
	private int x = 55; // 초기 55 
	private int y = 535;  // 초기 535

	public boolean isRight = false; // 상태를 물어보는 변수?
	public boolean isLeft = false;
	public boolean isUp = false;
	public boolean isDown = false;
	
	public int floor = 1; //535, 415, 295, 177 (enum으로 하면 편함)
	

	public Player() {
		icPlayerR = new ImageIcon("image/playerR.png");
		icPlayerL = new ImageIcon("image/playerL.png");

		setIcon(icPlayerR);
		setSize(50, 50); // 변하지 않는 것은 상태가 아니다.
		setLocation(x, y);
	}

	public void moveRight() { // 메서드의 이름을 정할때 행위를 먼저
		System.out.println(TAG + "moveRight");

		new Thread(new Runnable() {
			@Override
			public void run() {
				setIcon(icPlayerR);
				isRight = true;
				while (isRight) {
					x++;
					setLocation(x, y); // 내부에 repaint() 존재
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
					setLocation(x, y); // 내부에 repaint() 존재
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
					if(floor == 1 &&/*x좌표*/ y >=535 ) {
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


	// 구현안함
	public void attack() {
		
	}
}
