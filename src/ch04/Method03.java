package ch04;

class Cal { // ����
	static void add(int n1, int n2){ // void : ���ϰ��� ����.
		System.out.println(n1+n2);
	}
	
	static int minus(int n3, int n4) {
		return n3-n4;
	}
}

public class Method03 {
	public static void main(String[] args) {
		Cal.add(5, 6); // add�Լ��� ȣ��� �� add stack�� ������ add�� stack ������ 5, 6�� ��  
		
		// minus �Լ��� returnŸ���� int�̱� ������
		// Cal.minus(10,4)�� ȣ��� �� �޼��尡 ����Ǹ�
		// Cal.minus(10,4) ---> 6���� ����ȴ�.
		int result = Cal.minus(10, 4); 
		System.out.println(result);
	}
}

// �������� : stack�� ����
// �������� : static, heap�� ����