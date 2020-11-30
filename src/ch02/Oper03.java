package ch02;

public class Oper03 {
	public static void main(String[] args) {
		// 비교연산
		System.out.println(1==1);
		System.out.println(1==2);
		
		boolean s = (1==1); // String s = (1==1); 타입이 일치하지 않기 때문에 오류남
		
		System.out.println('a'>'b');
		System.out.println(3>=2);
		System.out.println(-1<0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3!=2));
		
		//비교 연산과 논리 연산 복합
		System.out.println((3>2)&&(3>4));
		System.out.println((3!=2)||(-1>0));
		System.out.println((3!=2)^(-1>0));
	}
}
