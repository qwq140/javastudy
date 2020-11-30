package ch02;

// heap
class Zealot{
	String name = "질럿";
	int attack = 10;
	int armor = 5;
	
	static int hp = 100;
}

// static은 처음부터 뜬다. 
public class Var08 {
	public static void main(String[] args) {
		//
		//
		//
		//
		//
		//
		Zealot z = new Zealot();//19번 라인에서 질럿 생성됨.
		System.out.println(z.name);
		System.out.println(z.attack);
		System.out.println(z.armor);
		
		Zealot z2 = new Zealot();// 24번 라인에서 질럿 생성됨.
		System.out.println(z2.name);
		System.out.println(z2.attack);
		System.out.println(z2.armor);
		
		z.attack = 50;
		
		
		System.out.println("변화 관찰");
		System.out.println(z.attack);
		System.out.println(z2.attack);
		
		Zealot.hp=50; // z.hp == z2.hp
		
		System.out.println(z.hp);
		System.out.println(z2.hp);
		
		//포지 업그레이드
		z.attack = 11; // 질럿의 attack이 모두 업그레이드 되어야 하므로 static으로 선언하는게 좋다.
		
		System.out.println(z.attack);
		System.out.println(z2.attack);
	}
}
//static은 정적 ... 처음부터 떠있는 데이터... static은 안 변하는 데이터
//heap은 변하는 데이터 ... 갑자기 나타나기도 사라지기도 하는 데이터