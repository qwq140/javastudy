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
	
	public String  makeClockText(){ // 레이블에 표시할 시간 텍스트 설정
		LocalDateTime now = LocalDateTime.now(); // 현재시간 받아오기
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
			setText(makeClockText()); // 1초마다 
		}
		
	}
	
}
public class DigitalClock extends JFrame{

	public DigitalClock() {
		setTitle("디지탈 시계 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(new MyLabel()); // 시간을 표시할 레이블 생성
		setSize(300, 200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		new DigitalClock();
	}

}
