package ch11;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx extends JFrame{
	public ButtonEx() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		// 3개의 이미지를 파일로부터 읽어들인다.
		ImageIcon normalIcon = new ImageIcon("image/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("image/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("image/pressedIcon.gif");
		
		// 3개의 이미지를 가진 버튼 생성
		JButton btn = new JButton("call~~",normalIcon);// normalIcon용 이미지
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);
		
		setSize(250, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonEx();

	}

}
