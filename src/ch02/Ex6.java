package ch02;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~99 사이의 정수를 입력하시오.");
		int num = sc.nextInt();
		
		if(num>10) {
			int num10 = num/10;
			int num1 = num%10;
			
			if(num10%3==0) {
				if(num1%3==0) {
					System.out.println("박수짝짝"); // 십의 자리수 일의 자리수 다 3의 배수
				} else {
					System.out.println("박수짝"); // 십의 자리수만 3의배수 
				}
			} else {
				if (num1%3==0) {
					System.out.println("박수짝"); // 일의 자리수만 3의배수
				}
			}
		} else {
			if(num%3==0) {
				System.out.println("박수짝");
			}
		}
	}
}
