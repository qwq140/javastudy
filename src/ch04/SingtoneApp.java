package ch04;

class President{
	
	private static President instance = new President(); // main 실행하기전 heap 공간을 띄움
	
	public static President getInstance() {
		return instance;
	}
	
	private President() {
		
	}
}



public class SingtoneApp {

	public static void main(String[] args) {
		President p = President.getInstance(); 
	}
}
