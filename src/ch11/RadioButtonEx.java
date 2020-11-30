package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame{
	public RadioButtonEx() {
		setTitle("라디오버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 이미지 라디오버튼을 만들기 위해 2개의 이미지 객체 생성
		ImageIcon cherryIcon = new ImageIcon("image/cherry.jpg"); // 해제 상태를 나타내는 이미지
		ImageIcon selectCherryIcon = new ImageIcon("image/selectedCherry.jpg");
		
		//버튼 그룹 객체 생성
		ButtonGroup g = new ButtonGroup(); // 3개의 라디오버튼을 묶을 버튼 그룹 객체 생성
		
		// 라디오버튼 3개 생성
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배",true);
		JRadioButton cherry = new JRadioButton("체리",cherryIcon);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectCherryIcon);
		
		// 버튼 그룹에 3개의 라디오버튼 삽입  / 버튼 그룹에 등록하여 하나만 선택되게 한다.
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		// 컨탠트팬에 3개의 라디오버튼 삽입 // 라디오버튼이 컨탠트팬에 삽입되어야 화면에 출력됨.
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
