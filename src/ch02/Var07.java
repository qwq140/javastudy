package ch02;

// Ŭ���� �ڷ��� static
class Car {
	static int power = 2000;
	static String color = "�Ͼ��";
	static String name = "�ҳ�Ÿ";
	static String type = "�¿���";
}

//static�� class���� ����
public class Var07 {
	public static void main(String[] args) {
		System.out.println(Car.power);
		System.out.println(Car.color);
		System.out.println(Car.name);
		System.out.println(Car.type);
	}
}