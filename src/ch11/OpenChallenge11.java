package ch11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenChallenge11 extends JFrame{

	public OpenChallenge11() {
		setTitle("Open Challenge 11");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		
		ImageIcon[] images = {
				new ImageIcon("image/image0.jpg"),
				new ImageIcon("image/image1.jpg"),
				new ImageIcon("image/image2.jpg"),
				new ImageIcon("image/image3.jpg"),
		};
		
		JPanel jp1 = new JPanel();
		
		
		ImageIcon[] imgBtn = {
				new ImageIcon("Image/left.png"),
				new ImageIcon("Image/right.png")
		};
		
		JButton[] btn = new JButton[2];
		
		JLabel imgLabel = new JLabel(images[0]);
		for (int i = 0; i < imgBtn.length; i++) {
			btn[i] = new JButton(imgBtn[i]);
			jp1.add(btn[i]);
		}
		btn[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				
			}
		});
		
		
		c.add(imgLabel,BorderLayout.CENTER);
		c.add(jp1,BorderLayout.SOUTH);
		
		
		setSize(300,350);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new OpenChallenge11();
	}

}
