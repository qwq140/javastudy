package ch06;


public class Wrapper01 {

	public static void main(String[] args) {
		int num = 10; // �⺻�ڷ���
		Integer num2 = 20; //class, ���۷���
		
		String num3 = num2.toString(); // ���ڸ� ���ڷ� �ٲٴ¹� 1
		System.out.println(num3);
		
		String num4 = num +""; // ���ڸ� ���ڷ� �ٲٴ¹� 2
		
		String num5 = "10";
		int num6 = Integer.parseInt(num5); // ���ڸ� ���ڷ� �ٲٴ¹�
		System.out.println(num6);
	}

}
