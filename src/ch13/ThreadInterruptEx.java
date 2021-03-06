package ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


class TimerRunnable implements Runnable{
	
	private JLabel timerLabel; // 타이머 값이 출력된 레이블
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		int n=0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return ;
			}
		}
		
	}
	
}

public class ThreadInterruptEx extends JFrame{
	private Thread th;
	public ThreadInterruptEx() {
		setTitle("ThreadInterrupt 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread (runnable);
		c.add(timerLabel);
		//버튼 생성
		JButton btn = new JButton("kill Timer");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt();
				JButton btn = (JButton) e.getSource();
				btn.setEnabled(false);
			}
		});
		c.add(btn);
		
		setSize(300,170);
		setVisible(true);
		
		th.start();
	}
	
	
	public static void main(String[] args) {
		new ThreadInterruptEx();

	}

}
