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
	private String[] text = {"사과", " 배", "체리"};
	private ImageIcon [] image = {
			new ImageIcon("image/apple.jpg"),
			new ImageIcon("image/pear.jpg"),
			new ImageIcon("image/cherry.jpg")
	};
	private JLabel imageLabel = new JLabel(); // 이미지가 출력될 레이블
	
	public RadiobuttonItemEventEx() {
		setTitle("라디오버튼 Item Event 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JPanel radioPanel = new JPanel(); // 3개의 라디오버튼을 부착할 패널
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup(); // 버튼 그룹 객체 생성
		for (int i = 0; i < radioBtn.length; i++) { // 3개의 라디오버튼에 대해
			radioBtn[i] = new JRadioButton(text[i]); // 라디오버튼 생성
			g.add(radioBtn[i]);
			radioPanel.add(radioBtn[i]);
			radioBtn[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange() == ItemEvent.DESELECTED)
						return; // 해제된 경우 리턴
					if(radioBtn[0].isSelected()) // 사과가 선택된 경우
						imageLabel.setIcon(image[0]);
					else if(radioBtn[1].isSelected()) // 배가 선택된 경우
						imageLabel.setIcon(image[1]);
					else // 체리가 선택된 경우
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
