package ch02;

public class Var04 {
	public static void main(String[] args) {
		// 숫자 여러개 1, 2, 3
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		
		// 숫자 여러개 1,2,3
		int[] n = {1,2,3}; // 배열은 추가, 제거가 안된다.
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n);
		
		//문자 여러개 가, 나 ,다
		char[] s= {'가','나','다'};
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
	}//end of main
}
