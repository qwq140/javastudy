package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame{
	public CheckBoxEx() {
		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// �̹��� üũ�ڽ��� ����� 2���� �̹��� ��ü ����
		ImageIcon cherryIcon = new ImageIcon("image/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("image/selectedCherry.jpg");
		
		//3���� üũ�ڽ� ����
		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��", true);
		JCheckBox cherry = new JCheckBox("ü��", cherryIcon);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxEx();
	}

}