package ch05;

// 어댑터 패턴

interface Nife {
	void 요리();
	void 상해();
}

// 어댑터 용도
abstract class 요리사Adapter implements Nife{
	public void 상해() {}
}

class 백종원 extends 요리사Adapter{

	@Override
	public void 요리() {
		// TODO Auto-generated method stub
		
	}
	

}


public class Adapter01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
