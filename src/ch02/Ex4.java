package ch02;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개 입력");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(n1>n2) {
			if(n2>n3) {
				System.out.println("중간 값은 "+n2); // n1 n2 n3
			} else if(n3>n1) {
				System.out.println("중간 값은 "+n1);
			}
		} else if (n2>n3) {
			if(n3>n1) {
				System.out.println("중간 값은 "+n3); // n2 n3 n1
			} else if (n1>n2) {
				System.out.println("중간 값은 "+n2);
			}
		} else if (n3>n1) {
			if(n1>n2) {
				System.out.println("중간 값은 "+n1); // n3 n1 n2
			} 	else if (n2>n3) {
				System.out.println("중간 값은 "+n3);
			}
		} else if (n2>n1) {
			if (n1>n3) {
				System.out.println("중간 값은 "+n1); // n2 n1 n3
			} else if (n3>n2) {
				System.out.println("중간 값은 "+n2);
			}
		} else if (n3>n2) {
			if (n2>n1) {
				System.out.println("중간 값은 "+n2); // n3 n2 n1
			} else if (n1>n3) {
				System.out.println("중간 값은 "+n3);
			}
		} else if (n1>n3) {
			if (n3>n2) {
				System.out.println("중간 값은 "+n3); // n1 n3 n2
			} else if (n2>n1) {
				System.out.println("중간 값은 "+n1);
			}
		}
	}
}
