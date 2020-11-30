package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame{
	public RadioButtonEx() {
		setTitle("������ư ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// �̹��� ������ư�� ����� ���� 2���� �̹��� ��ü ����
		ImageIcon cherryIcon = new ImageIcon("image/cherry.jpg"); // ���� ���¸� ��Ÿ���� �̹���
		ImageIcon selectCherryIcon = new ImageIcon("image/selectedCherry.jpg");
		
		//��ư �׷� ��ü ����
		ButtonGroup g = new ButtonGroup(); // 3���� ������ư�� ���� ��ư �׷� ��ü ����
		
		// ������ư 3�� ����
		JRadioButton apple = new JRadioButton("���");
		JRadioButton pear = new JRadioButton("��",true);
		JRadioButton cherry = new JRadioButton("ü��",cherryIcon);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectCherryIcon);
		
		// ��ư �׷쿡 3���� ������ư ����  / ��ư �׷쿡 ����Ͽ� �ϳ��� ���õǰ� �Ѵ�.
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		// ����Ʈ�ҿ� 3���� ������ư ���� // ������ư�� ����Ʈ�ҿ� ���ԵǾ�� ȭ�鿡 ��µ�.
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RadioButtonEx();

	}

}
