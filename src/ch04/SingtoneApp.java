package ch04;

class President{
	
	private static President instance = new President(); // main �����ϱ��� heap ������ ���
	
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
