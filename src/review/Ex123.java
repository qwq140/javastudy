package review;

// 내가 메서드를 전달할때 interface 사용
// 메서드를 전달할 때 인터페이스를 통해 전달할 때는 익명클래스를 사용한다.
interface Helloable{
	void 안녕();
}

public class Ex123 {

	static void start(Helloable h) {
		h.안녕();
	}
	
	public static void main(String[] args) {
		start(new Helloable() {
			
			@Override
			public void 안녕() {
				System.out.println("반갑습니다.");
				
			}
		});

	}

}
