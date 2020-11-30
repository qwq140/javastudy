package ch03;

public class For03 {
	static void starPoint(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void main(String[] args) {
	//*
//		**
//		***
//		****
//		*****
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
		for (int i = 1; i < 6; i++) {
			starPoint(i);
		}
	}
}
