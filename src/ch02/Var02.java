package ch02;

public class Var02 {
	public static void main(String[] args) {
		// Code부분
		int num = 10; // 4Byte - 32bit - 42억9천(-20억 ~ +20억)
		long num2 = 100; // 8Byte - 64bit - 경단위
		
		char s = 'A'; //2Byte
		
		double d = 7.5;//8Byte - 42억9천(-20억 ~ +20억) 추가 소수점 이하
		
		boolean b = true; // 1bit
		
		num = (int)d; // 명시적 형변환 (다운 캐스팅 - 자료 유실) //7
		
		num=(int)num2; // 명시적 형변환 (다운 캐스팅) //10
		
		num2 = num; //묵시적 형변환 (업 캐스팅) //10
	}//end of main
}
