package ch11;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx extends JFrame{
	public ButtonEx() {
		setTitle("�̹��� ��ư ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		// 3���� �̹����� ���Ϸκ��� �о���δ�.
		ImageIcon normalIcon = new ImageIcon("image/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("image/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("image/pressedIcon.gif");
		
		// 3���� �̹����� ���� ��ư ����
		JButton btn = new JButton("call~~",normalIcon);// normalIcon�� �̹���
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
