package ch04;

class TV2{
	int size;
	String mf;
	public TV2() {
		this(32,"LG");
	}
	
	public TV2(String mf) {
		this(32,mf);
	}
	
	public TV2(int size, String mf) {
		this.size=size;
		this.mf=mf;
		System.out.println(size+"��ġ "+mf);
	}
}
public class TVApp2 {
	
	public static void main(String[] args) {
		new TV2();
		new TV2("�Ｚ");
		new TV2(65,"�Ｚ");

	}

}
