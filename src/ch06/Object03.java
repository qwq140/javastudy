package ch06;

public class Object03 {

	public static void main(String[] args) {
		String str1 = "홍길동"; // 최초 엑세스했을 때 str1의 내용은 주소
		String str2 = "홍길동";
		
		int num = 10; // 최초 엑세스 했을 때 num의 내용은 10
		// == : 최초 엑세스한 메모리 공간의 내용을 비교 (주소가 될 수 있고 데이터가 될 수 있다.)
		System.out.println(str1 == str2);
		
		
		// String의 Hash함수는 오버라이딩되서
		// 같은 문자열이면 같은 해시를 뽑아낸다.
		String str3 = "임꺽정"; // Heap 내부의 Constant Pool
		String str4 = new String("임꺽정");// Heap
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str3 == str4);
		
		
		// == 으로 먼저 비교 같으면 true
		// == 으로 비교했는데 false가 나오면 최종목적지 값을 비교
		// 문자열을 비교하고 싶으면 .equals를 이용
		System.out.println(str3.equals(str4));
	}

}
