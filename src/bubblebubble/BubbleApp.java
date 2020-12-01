package bubblebubble;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleApp extends JFrame implements Initable{
	
	//컨텍스트 저장
	private BubbleApp bubbleApp = this;
	// 태그
	private static final String TAG = "BubbleApp :";
	private JLabel laBackground; //백그라운드 라벨
	private Player player;
	
	public BubbleApp() {
		init();
		setting();
		batch();
		listener();
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new BubbleApp();
	}


	@Override
	public void init() {
		laBackground = new JLabel(new ImageIcon("image/bg.png"));
		player = new Player();
	}


	@Override
	public void setting() {
		setTitle("버블버블");
		System.out.println(TAG+"이 부분 실행 되나?");
		setSize(1000, 639);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setContentPane(laBackground);
	}


	@Override
	public void batch() {
		add(player);
	}


	@Override
	public void listener() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					if(player.isRight == false) {
						player.moveRight();
					}
				} else if (e.getKeyCode() ==KeyEvent.VK_LEFT ) {
					if(player.isLeft == false) {
						player.moveLeft();
					}
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					player.moveUp();
				} 
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					player.isRight = false;
				} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					player.isLeft = false;
				}
			}
		});
	}

}
