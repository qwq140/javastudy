package star2;

public class StarApp {
	
	static void attack(StarUnit u1, StarUnit u2) {
		u2.setHp(u2.getHp()-u1.getAttack());
		System.out.println(u2.getName()+"�� ���� ü�� : "+u2.getHp());
	}
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot("����1",100,10);
		Tank t1 = new Tank("��ũ1",150,30);
		Marine m1 = new Marine("����1",40,6);
		Dragoon d1 = new Dragoon("���1",120,20);
		DarkTempler dt1 = new DarkTempler("��ũ���÷�1",100,40);

		attack(z1,t1);
		attack(t1,m1);
		attack(m1,d1);
		attack(d1,dt1);
		attack(dt1,z1);
		
	}

}
