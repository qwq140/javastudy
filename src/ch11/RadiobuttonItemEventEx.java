package ch11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class RadiobuttonItemEventEx extends JFrame{
	private JRadioButton [] radioBtn = new JRadioButton[3];
	private String[] text = {"���", " ��", "ü��"};
	private ImageIcon [] image = {
			new ImageIcon("image/apple.jpg"),
			new ImageIcon("image/pear.jpg"),
			new ImageIcon("image/cherry.jpg")
	};
	private JLabel imageLabel = new JLabel(); // �̹����� ��µ� ���̺�
	
	public RadiobuttonItemEventEx() {
		setTitle("������ư Item Event ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JPanel radioPanel = new JPanel(); // 3���� ������ư�� ������ �г�
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup(); // ��ư �׷� ��ü ����
		for (int i = 0; i < radioBtn.length; i++) { // 3���� ������ư�� ����
			radioBtn[i] = new JRadioButton(text[i]); // ������ư ����
			g.add(radioBtn[i]);
			radioPanel.add(radioBtn[i]);
			radioBtn[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange() == ItemEvent.DESELECTED)
						return; // ������ ��� ����
					if(radioBtn[0].isSelected()) // ����� ���õ� ���
						imageLabel.setIcon(image[0]);
					else if(radioBtn[1].isSelected()) // �谡 ���õ� ���
						imageLabel.setIcon(image[1]);
					else // ü���� ���õ� ���
						imageLabel.setIcon(image[2]);
				}
			});
			
		}
		radioBtn[2].setSelected(true);
		c.add(radioPanel,BorderLayout.NORTH);
		c.add(imageLabel,BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(250, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RadiobuttonItemEventEx();

	}

}
