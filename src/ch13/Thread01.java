package ch13;

class Another implements Runnable{ // Runnable 타입이 되어야 함.
	
	// 실행단위 코드블록 = 스택(스레드)
	@Override
	public void run() { // 무조건 run() 
		System.out.println("새로운 스레드가 실행됨");
		for (int i = 0; i < 11; i++) {
			try {
				System.out.println("run : "+ i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("새로운 스레드 종료");
	}
}

public class Thread01 {

	public static void main(String[] args) {
		System.out.println("main 스레드가 실행됨");
		
		//새로운 스레드 실행 1. 스레드 객체 생성, 2. 타겟 설정 3.실행
		Thread t1 = new Thread(new Another());
		t1.start(); // JVM이 run() 때림  ( 콜백 ) // 독립적인 스레드 실행한다고 생각(실제로는 스위칭)
		
		for (int i = 0; i < 11; i++) { 
			try {
				System.out.println("main : "+ i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main 쓰레드 종료");
	}//end of main()

}
