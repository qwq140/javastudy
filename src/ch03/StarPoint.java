package ch03;

public class StarPoint {
	static void starPoint1(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void main(String[] args) {
//		for (int i = 5; i > 0; i--) {
//			starPoint1(i);
//		}
		
//		for (int i = 1; i < 6; i++) {
//			if(i>3) {
//				int j = 6-i;
//				starPoint1(j);
//			} else {
//				starPoint1(i);
//			}
//		}
		
		int num = 15;
		int range = num+1;
		for (int i = 1; i < range; i++) {
			if(i<=range/2) {
				for (int j = range/2; j > i; j--) {
					System.out.print("  ");
				}
				starPoint1(i*2-1);
			} else {
				for (int j = range/2; j < i; j++) {
					System.out.print("  ");
				}
				starPoint1(2*num+1-2*i);
			}
		}
	}

}
