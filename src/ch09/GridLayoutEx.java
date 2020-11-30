package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame{
	
	private JLabel laName, laNum, laClass, laSubject;
	private JTextField tfName, tfNum, tfClass, tfSubject;
	private Container c;
	private GridLayout grid;
	
	
	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		// X버튼을 클릭하면 main이 종료됨.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		
		//1.필요한 오브젝트를 메모리에 로딩
		initObject();
		
		//2. 세팅
		initSetting();
		
		//3. 배치
		initBatch();
		
	
		setVisible(true);
	}
	
	//컴퍼넌트 혹은 컨테이너 초기화
	public void initObject() {
		laName = new JLabel("이름");
		laNum = new JLabel("학번");
		laClass = new JLabel("학과");
		laSubject = new JLabel("과목");
		tfName = new JTextField("");
		tfNum = new JTextField("");
		tfClass = new JTextField("");
		tfSubject = new JTextField("");
	}
	
	public void initSetting() {
		c = getContentPane();
		grid = new GridLayout(4, 2);
		grid.setVgap(5);
		c.setLayout(grid);
	}
	
	private void initBatch() {
		c.add(laName);
		c.add(tfName);
		c.add(laNum);
		c.add(tfNum);
		c.add(laClass);
		c.add(tfClass);
		c.add(laSubject);
		c.add(tfSubject);
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();

	}
	

}
