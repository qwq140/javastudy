package ch06;

public class Object03 {

	public static void main(String[] args) {
		String str1 = "ȫ�浿"; // ���� ���������� �� str1�� ������ �ּ�
		String str2 = "ȫ�浿";
		
		int num = 10; // ���� ������ ���� �� num�� ������ 10
		// == : ���� �������� �޸� ������ ������ �� (�ּҰ� �� �� �ְ� �����Ͱ� �� �� �ִ�.)
		System.out.println(str1 == str2);
		
		
		// String�� Hash�Լ��� �������̵��Ǽ�
		// ���� ���ڿ��̸� ���� �ؽø� �̾Ƴ���.
		String str3 = "�Ӳ���"; // Heap ������ Constant Pool
		String str4 = new String("�Ӳ���");// Heap
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str3 == str4);
		
		
		// == ���� ���� �� ������ true
		// == ���� ���ߴµ� false�� ������ ���������� ���� ��
		// ���ڿ��� ���ϰ� ������ .equals�� �̿�
		System.out.println(str3.equals(str4));
	}

}
