package ch04;

//ctrl + shift + f �ڵ� ����
//�޼���ȿ� �޼��带 ������ �� ����.
//������ �޼��带 ���� �� ����.
public class Method04 {
	
	int money = 10000; //heap
	
	int add(int num) { //int num stack, add() heap
		int money2 = money + num;
		return money2; //�����ϰ� ���� ����
	} // money�� heap�̱� ������ �Լ��� ����ǵ� ������� �ʴ´�.
	
	public static void main(String[] args) {
		Method04 m = new Method04(); // heap ���� ȣ��
		int money2 = m.add(50000); // add �޼��� ȣ��
		System.out.println(money2);
		System.out.println(m.money); // money�� heap�̱� ������ ȣ�Ⱑ��
	}
}
