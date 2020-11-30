package ch04;

// 자바 특징 : 모든 코드는 class 내부에 둬야 한다.
public class Method01 {
	
	static void add() {
		System.out.println("add함수 호출됨");
	}
	
	void sound() {
		System.out.println("sound함수 호출됨");
	}
	
	public static void main(String[] args) {
		Method01.add(); // static 호출
		
		Method01 m = new Method01(); // new 클래스명(); Heap 호출
		m.sound();
	}
}
