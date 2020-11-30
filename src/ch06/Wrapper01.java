package ch06;


public class Wrapper01 {

	public static void main(String[] args) {
		int num = 10; // 기본자료형
		Integer num2 = 20; //class, 레퍼런스
		
		String num3 = num2.toString(); // 숫자를 문자로 바꾸는법 1
		System.out.println(num3);
		
		String num4 = num +""; // 숫자를 문자로 바꾸는법 2
		
		String num5 = "10";
		int num6 = Integer.parseInt(num5); // 문자를 숫자로 바꾸는법
		System.out.println(num6);
	}

}
