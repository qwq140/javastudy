package ch02;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~99 ������ ������ �Է��Ͻÿ�.");
		int num = sc.nextInt();
		
		if(num>10) {
			int num10 = num/10;
			int num1 = num%10;
			
			if(num10%3==0) {
				if(num1%3==0) {
					System.out.println("�ڼ�¦¦"); // ���� �ڸ��� ���� �ڸ��� �� 3�� ���
				} else {
					System.out.println("�ڼ�¦"); // ���� �ڸ����� 3�ǹ�� 
				}
			} else {
				if (num1%3==0) {
					System.out.println("�ڼ�¦"); // ���� �ڸ����� 3�ǹ��
				}
			}
		} else {
			if(num%3==0) {
				System.out.println("�ڼ�¦");
			}
		}
	}
}
