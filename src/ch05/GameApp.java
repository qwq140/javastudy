package ch05;

public class GameApp {
	
	//���̽�ƽ
	static void start(Control c) {
		c.����();
		c.�극��ũ();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ferari f = new Ferari();
		start(f);
	}
}
