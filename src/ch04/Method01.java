package ch04;

// �ڹ� Ư¡ : ��� �ڵ�� class ���ο� �־� �Ѵ�.
public class Method01 {
	
	static void add() {
		System.out.println("add�Լ� ȣ���");
	}
	
	void sound() {
		System.out.println("sound�Լ� ȣ���");
	}
	
	public static void main(String[] args) {
		Method01.add(); // static ȣ��
		
		Method01 m = new Method01(); // new Ŭ������(); Heap ȣ��
		m.sound();
	}
}
