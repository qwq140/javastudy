package ch11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboActionEx extends JFrame{
	private String[] fruits = {"apple", "banana", "kiwi", "mango"};
	private ImageIcon [] images = {
			new ImageIcon("image/apple.jpg"),
			new ImageIcon("image/banana.jpg"),
			new ImageIcon("image/kiwi.jpg"),
			new ImageIcon("image/mango.jpg")
	};
	private JLabel imageLabel = new JLabel(images[0]);
	private JComboBox<String> strCombo = new JComboBox<String>(fruits);
	
	public ComboActionEx() {
		setTitle("콤보박스 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imageLabel);
		
		// Action 리스너 등록
		strCombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex(); // 콤보박스의 선택된 아이템의 인덱스 번호 알아내기
				imageLabel.setIcon(images[index]);
				
			}
		});
		
		setSize(300, 250);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ComboActionEx();

	}

}
