package ch04;

//ctrl + shift + f 코드 정렬
//메서드안에 메서드를 정의할 수 없다.
//변수에 메서드를 담을 수 없다.
public class Method04 {
	
	int money = 10000; //heap
	
	int add(int num) { //int num stack, add() heap
		int money2 = money + num;
		return money2; //순수하게 값을 리턴
	} // money는 heap이기 때문에 함수가 종료되도 사라지지 않는다.
	
	public static void main(String[] args) {
		Method04 m = new Method04(); // heap 영역 호출
		int money2 = m.add(50000); // add 메서드 호출
		System.out.println(money2);
		System.out.println(m.money); // money는 heap이기 때문에 호출가능
	}
}
