package ch04;

class Dog{
	int 배고픔 = 100; // 상태
	
	void eat() { // 행위      상태는 행위(메서드)를 통해서 변경해야함
		배고픔 = 10;
	}
}

public class Method02 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
        //d1.배고픔 = 10; // 마법은 안됨.
		
		d1.eat();
		System.out.println("강아지의 배고픔 : "+d1.배고픔);
	}
}
