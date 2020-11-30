package ch13;

public class Thread03 {
	static int sum=0;
	static class NewThread implements Runnable{ //내부클래스로 쓸때는 static으로 하는것이 좋다.
		
		
		@Override
		public void run() {
			System.out.println("새로운 스레드 시작");
			for (int i = 1; i < 11; i++) {
				sum = sum+10;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("새로운 스레드 종료");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		Thread t1 = new Thread(new NewThread());
		t1.start();
		
		try {
			t1.join(); // t1이 끝날때까지 대기 , 동기적 방법 / 비동기적 방법으로 콜백이 있다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(sum);
		System.out.println("메인 스레드 종료");
	}

}
