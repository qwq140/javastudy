package ch02;

public class Var02 {
	public static void main(String[] args) {
		// Code�κ�
		int num = 10; // 4Byte - 32bit - 42��9õ(-20�� ~ +20��)
		long num2 = 100; // 8Byte - 64bit - �����
		
		char s = 'A'; //2Byte
		
		double d = 7.5;//8Byte - 42��9õ(-20�� ~ +20��) �߰� �Ҽ��� ����
		
		boolean b = true; // 1bit
		
		num = (int)d; // ����� ����ȯ (�ٿ� ĳ���� - �ڷ� ����) //7
		
		num=(int)num2; // ����� ����ȯ (�ٿ� ĳ����) //10
		
		num2 = num; //������ ����ȯ (�� ĳ����) //10
	}//end of main
}
