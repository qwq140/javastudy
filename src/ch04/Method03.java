package ch04;

class Cal { // 계산기
	static void add(int n1, int n2){ // void : 리턴값이 없다.
		System.out.println(n1+n2);
	}
	
	static int minus(int n3, int n4) {
		return n3-n4;
	}
}

public class Method03 {
	public static void main(String[] args) {
		Cal.add(5, 6); // add함수가 호출될 때 add stack이 열리고 add의 stack 공간에 5, 6이 들어감  
		
		// minus 함수는 return타입이 int이기 때문에
		// Cal.minus(10,4)가 호출된 후 메서드가 종료되면
		// Cal.minus(10,4) ---> 6으로 변경된다.
		int result = Cal.minus(10, 4); 
		System.out.println(result);
	}
}

// 지역변수 : stack이 관리
// 전역변수 : static, heap이 관리