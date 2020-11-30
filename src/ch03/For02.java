package ch03;

public class For02 {

	public static void main(String[] args) {
		// Â¦¼ö 1 ~ 100
		for (int i = 1; i < 101; i++) {
			if(i%2==0) {
				System.out.println("Â¦¼ö : "+i);
			}
		}
		System.out.println();
		// È¦¼ö 1 ~ 100
		for (int i = 1; i < 101; i++) {
			if(i%2==1) {
				System.out.println("È¦¼ö : "+i);
			}
		}
		System.out.println();
		//50 ~ 1 ±îÁöÀÇ ¼ö Áß È¦¼ö Ãâ·Â (³»¸²Â÷¼ø)
		for (int i = 50; i > 0; i--) {
			if(i % 2 == 1) {
				System.out.println("È¦¼ö : "+i);
			}
		}
	}
}
