package ch02;

// heap
class Zealot{
	String name = "����";
	int attack = 10;
	int armor = 5;
	
	static int hp = 100;
}

// static�� ó������ ���. 
public class Var08 {
	public static void main(String[] args) {
		//
		//
		//
		//
		//
		//
		Zealot z = new Zealot();//19�� ���ο��� ���� ������.
		System.out.println(z.name);
		System.out.println(z.attack);
		System.out.println(z.armor);
		
		Zealot z2 = new Zealot();// 24�� ���ο��� ���� ������.
		System.out.println(z2.name);
		System.out.println(z2.attack);
		System.out.println(z2.armor);
		
		z.attack = 50;
		
		
		System.out.println("��ȭ ����");
		System.out.println(z.attack);
		System.out.println(z2.attack);
		
		Zealot.hp=50; // z.hp == z2.hp
		
		System.out.println(z.hp);
		System.out.println(z2.hp);
		
		//���� ���׷��̵�
		z.attack = 11; // ������ attack�� ��� ���׷��̵� �Ǿ�� �ϹǷ� static���� �����ϴ°� ����.
		
		System.out.println(z.attack);
		System.out.println(z2.attack);
	}
}
//static�� ���� ... ó������ ���ִ� ������... static�� �� ���ϴ� ������
//heap�� ���ϴ� ������ ... ���ڱ� ��Ÿ���⵵ ������⵵ �ϴ� ������