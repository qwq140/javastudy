package star1;

// 1. Zealot, Dragoon, Tank, Scv, DarkTempler => StarUnit 타입 일치 (부모 타입으로 묶기)
//함수로 변수에 접근
public class Star3App {
	
	public static void attack(StarUnit u1, StarUnit u2) {
		System.out.println(u1.getName()+" -> "+u2.getName()+" 공격");
		int hp = u2.getHp() - u1.getAttack();
		u2.setHp(hp);
		System.out.println(u2.getName()+" 체력 : "+u2.getHp());
	}
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot("질럿1",100,10);
		Zealot z2 = new Zealot("질럿2",100,10);
		
		Dragoon d1 = new Dragoon("드라군1", 100, 20);
		
		DarkTempler dt1 = new DarkTempler("다크템플러1",100,50);
		
		Tank t1 = new Tank("탱크1",150,30);
		
		attack(z1,z2);
		attack(dt1,z2);
		attack(dt1,z1);
		attack(d1,dt1);
		attack(t1,d1);
		
	}
}
