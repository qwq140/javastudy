package ch13;

import java.awt.Container;
import java.awt.Font;
import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyLabel extends JLabel implements Runnable{
	private Thread timerThread;
	public MyLabel() {
		setText(makeClockText());
		setFont(new Font("TimesRoman", Font.ITALIC, 50));
		setHorizontalAlignment(JLabel.CENTER);
		timerThread = new Thread(this);
		timerThread.start();
	}
	
	public String  makeClockText(){ // ���̺� ǥ���� �ð� �ؽ�Ʈ ����
		LocalDateTime now = LocalDateTime.now(); // ����ð� �޾ƿ���
		int hour = now.getHour();
		int min = now.getMinute();
		int sec = now.getSecond();
		
		String  clockText = Integer.toString(hour);
		clockText = clockText.concat(":");
		clockText = clockText.concat(Integer.toString(min));
		clockText = clockText.concat(":");
		clockText = clockText.concat(Integer.toString(sec));
		
		return clockText;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return ;
			}
			setText(makeClockText()); // 1�ʸ��� 
		}
		
	}
	
}
public class DigitalClock extends JFrame{

	public DigitalClock() {
		setTitle("����Ż �ð� �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(new MyLabel()); // �ð��� ǥ���� ���̺� ����
		setSize(300, 200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		new DigitalClock();
	}

}
