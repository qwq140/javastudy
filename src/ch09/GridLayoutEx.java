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
		// X��ư�� Ŭ���ϸ� main�� �����.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		
		//1.�ʿ��� ������Ʈ�� �޸𸮿� �ε�
		initObject();
		
		//2. ����
		initSetting();
		
		//3. ��ġ
		initBatch();
		
	
		setVisible(true);
	}
	
	//���۳�Ʈ Ȥ�� �����̳� �ʱ�ȭ
	public void initObject() {
		laName = new JLabel("�̸�");
		laNum = new JLabel("�й�");
		laClass = new JLabel("�а�");
		laSubject = new JLabel("����");
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
